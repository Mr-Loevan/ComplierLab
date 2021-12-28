//grammar calc;
//
//        compUnit:funcDef;
//        funcDef:FuncType Ident '(' ')' block;
//        block:'{' stmt '}';
//        stmt:'return' exp ';';
//        exp: addExp;
//        addExp: mulExp  #addExp1|
//        addExp('+'|'-')mulExp   #addExp2;
//        mulExp: unaryExp    #mulExp1|
//        mulExp('*'|'/'|'%')unaryExp #mulExp2;
//        unaryExp: primaryExp    #unaryExp1
//        |UnaryOp unaryExp   #unaryExp2;
//        primaryExp: '('exp')'   #primaryExp1
//        |number     #primaryExp2;
//        number: number1|number2|number3;
//        number1: Decimal_const;
//        number2: Octal_const;
//        number3: Hexadecimal_const;
//        UnaryOp: '+'|'-';
//        Decimal_const: Nonzero_digit Digit*;
//        Octal_const: '0' Octal_digit*;
//        Hexadecimal_const: Hexadecimal_prefix Hexadecimal_digit+;
//        Hexadecimal_prefix:'0x'|'0X';
//        Nonzero_digit:'1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
//        Octal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
//        Digit:'0' | Nonzero_digit;
//        Hexadecimal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
//        | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'
//        | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';
//        WS:(' '|'\t'|'\n'|'\r')+{skip();};
//        FuncType:'int';
//        Ident:'main';
//        LINE_COMMENT:'//' .*? '\r'? '\n'{skip();} ;
//        BLOCK_COMMENT:'/*' .*? '*/' {skip();};

import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

public class MyVisitor extends calcBaseVisitor<Integer>{
    String blockname;
    Map<String, Integer> memory = new HashMap<>();
    Map<String, Integer> varTable = new HashMap<>();
    Map<String, Integer> constVarTable = new HashMap<>();
    @Override public Integer visitFuncDef(calcParser.FuncDefContext ctx) {
        String funcName = ctx.Ident().getText();
        System.out.print("define dso_local i32 @");
        System.out.print(funcName);
        blockname = funcName;
        memory.put(blockname,0);
        System.out.println("()");
        visit(ctx.block());
        return 0;
    }

    @Override public Integer visitBlock(calcParser.BlockContext ctx){
        System.out.println('{');
        ctx.blockItem().forEach(blockItemContext -> {visit(blockItemContext);});
        System.out.println('}');
        return 0;
    }
//    stmt:   lVal'='exp';' #stmt1|
//            (exp)? ';'#stmt2|
//            'if' '(' cond ')'stmt ( 'else' stmt )?#stmt3|
//    block  #stmt4|
//            'return' exp ';'#stmt5;
    @Override
    public Integer visitStmt5(calcParser.Stmt5Context ctx) {
        System.out.println("ret i32 %"+visit(ctx.exp()));
        return 0;
    }

    @Override
    public Integer visitStmt1(calcParser.Stmt1Context ctx) {
        String s = ctx.lVal().getText();
        if(varTable.get(s)==null)   System.exit(-1);
        int reg = varTable.get(s);
        int l = visit(ctx.exp());
        System.out.printf("store i32 %%%d, i32* %%%d\n",l,reg);
        return 0;
    }

    @Override
    public Integer visitStmt2(calcParser.Stmt2Context ctx) {
        visit(ctx.exp());
        return 0;
    }
//    varDef:Ident#varDef1|
//    Ident '='initVal#varDef2;
    @Override
    public Integer visitVarDef1(calcParser.VarDef1Context ctx) {
       String s = ctx.Ident().getText();
       int reg = memory.get(blockname);
       if(varTable.get(s)==null&&constVarTable.get(s)==null){
           reg++;
           memory.replace(blockname,reg);
           varTable.put(s,reg);
           System.out.printf("%%%d = alloca i32\n",reg);
       }else
           System.exit(-1);
       return reg;
    }

    @Override
    public Integer visitVarDef2(calcParser.VarDef2Context ctx) {
        String s = ctx.Ident().getText();
        int val = visit(ctx.initVal());
        int reg = memory.get(blockname);
        if(varTable.get(s)==null&&constVarTable.get(s)==null){
            reg++;
            memory.replace(blockname,reg);
            varTable.put(s,reg);
            System.out.printf("%%%d = alloca i32\n",reg);
            System.out.printf("store i32 %%%d, i32* %%%d\n",val,reg);
        }else
            System.exit(-1);
        return reg;
    }
//  initVal:exp;
    @Override
    public Integer visitInitVal(calcParser.InitValContext ctx) {
        return visit(ctx.exp());
    }
//    constdecl: 'const' BType constDef ( ',' constDef )* ';';
//    constDef:Ident '=' constInitval;
//    constInitval: constExp;

    @Override
    public Integer visitConstExp(calcParser.ConstExpContext ctx) {
        return visit(ctx.addExp());
    }

    @Override
    public Integer visitConstDef(calcParser.ConstDefContext ctx) {
        String s = ctx.Ident().getText();
        int reg = visit(ctx.constInitval());
        if(varTable.get(s)==null&&constVarTable.get(s)==null){
            constVarTable.put(s,reg);
        }else{
            System.exit(-1);
        }
        return reg;
    }

    @Override
    public Integer visitConstInitval(calcParser.ConstInitvalContext ctx) {
        return visit(ctx.constExp());
    }

    @Override
    public Integer visitExp(calcParser.ExpContext ctx) {
        return visit(ctx.addExp());
    }

    @Override
    public Integer visitAddExp1(calcParser.AddExp1Context ctx) {
        return visit(ctx.mulExp());
    }
    //        addExp('+'|'-')mulExp   #addExp2;
    @Override
    public Integer visitAddExp2(calcParser.AddExp2Context ctx) {
        String c = ctx.UnaryOp().getText();
        int l = visit(ctx.addExp());
        int r = visit(ctx.mulExp());
        int time = memory.get(blockname);
        time++;
        memory.replace(blockname,time);
        switch (c){
            case "+":
                System.out.printf("%%%d = add i32 %%%d, %%%d\n",time,l,r);
                break;
            case "-":
                System.out.printf("%%%d = sub i32 %%%d, %%%d\n",time,l,r);
                break;
            default:
                System.out.println(c);
                System.exit(-1);
        }
        return time;
    }
//    mulExp: unaryExp    #mulExp1|
//    mulExp op2=('*'|'/'|'%') unaryExp #mulExp2;
    @Override
    public Integer visitMulExp1(calcParser.MulExp1Context ctx) {
        return super.visitMulExp1(ctx);
    }

    @Override
    public Integer visitMulExp2(calcParser.MulExp2Context ctx) {
        String c = ctx.MulOp().getText();
        int l = visit(ctx.mulExp());
        int r = visit(ctx.unaryExp());
        int time = memory.get(blockname);
        time++;
        memory.replace(blockname,time);
        switch (c){
            case "*":
                System.out.printf("%%%d = mul i32 %%%d, %%%d\n",time,l,r);
                break;
            case "/":
                System.out.printf("%%%d = sdiv i32 %%%d, %%%d\n",time,l,r);
                break;
            case "%":
                System.out.printf("%%%d = srem i32 %%%d, %%%d\n",time,l,r);
                break;
            default:
                System.out.println(c);
                System.out.println("mule2");
                System.exit(-1);
        }
        return time;
    }
//    unaryExp: primaryExp    #unaryExp1
//        |UnaryOp unaryExp   #unaryExp2
//        |Ident '('(funcRParams)?')' #unaryExp3;

    @Override
    public Integer visitUnaryExp2(calcParser.UnaryExp2Context ctx) {
        int val = visit(ctx.unaryExp());
        String op = ctx.UnaryOp().getText();
        int time = memory.get(blockname);
        time++;
        memory.replace(blockname,time);
        switch (op){
            case "+":
                System.out.printf("%%%d = add i32 0, %%%d\n",time,val);
                break;
            case "-":
                System.out.printf("%%%d = sub i32 0, %%%d\n",time,val);
                break;
            default:
                System.out.println(op);
                System.exit(-1);
        }
        return time;
    }

    @Override
    public Integer visitUnaryExp3(calcParser.UnaryExp3Context ctx) {
        String s = ctx.Ident().getText();
        Vector<Integer> params = new Vector<Integer>();
        int reg=0;
        switch (s){
            case "getint":
                reg = memory.get(blockname);
                reg++;
                memory.replace(blockname,reg);
                System.out.printf("%%%d = call i32 @getint()\n",reg);
                break;
            case "putint":
                try{
                    ctx.funcRParams().exp().forEach(expContext -> {
                        params.add(visit(expContext));
                    });
                    System.out.printf("call void @putint(i32 %%%d)\n", params.get(0));
                }catch (Exception e){
                    System.exit(-1);
                }
                break;
            case "getch":
                reg = memory.get(blockname);
                reg++;
                memory.replace(blockname,reg);
                System.out.printf("%%%d = call i32 @getch()\n",reg);
                break;
            case "putch":
                try {
                    ctx.funcRParams().exp().forEach(expContext -> {
                        params.add(visit(expContext));
                    });
                    System.out.printf("call void @putch(i32 %%%d)\n", params.get(0));
                }catch (Exception e){
                    System.exit(-1);
                }
                break;
        }
        return reg;
    }

    @Override
    public Integer visitFuncRParams(calcParser.FuncRParamsContext ctx) {
        return super.visitFuncRParams(ctx);
    }
    //    primaryExp: '('exp')'   #primaryExp1
//        |number     #primaryExp2
//        |lVal       #primaryExp3;

    @Override
    public Integer visitPrimaryExp1(calcParser.PrimaryExp1Context ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Integer visitPrimaryExp2(calcParser.PrimaryExp2Context ctx) {
        int val = visit(ctx.number());
        int time = memory.get(blockname);
        time++;
        memory.replace(blockname,time);
        System.out.printf("%%%d = add i32 0, %d\n",time,val);
        return time;
    }

    @Override
    public Integer visitPrimaryExp3(calcParser.PrimaryExp3Context ctx) {
        String s = ctx.lVal().getText();
        int reg = memory.get(blockname);
        reg++;
        if(varTable.get(s)!=null){
            int addr = varTable.get(s);
            memory.replace(blockname,reg);
            System.out.printf("%%%d = load i32, i32* %%%d\n",reg,addr);
        }else if(constVarTable.get(s)!=null){
            int val = constVarTable.get(s);
            memory.replace(blockname,reg);
            System.out.printf("%%%d = add i32 0, %%%d\n", reg,val);
        }else
            System.exit(-1);
        return reg;
    }

    @Override public Integer visitNumber1(calcParser.Number1Context ctx){
        String s = ctx.Decimal_const().getText();
        return Integer.parseInt(s,10);
    }
    @Override public Integer visitNumber2(calcParser.Number2Context ctx){

        String s = ctx.Octal_const().getText();
        return Integer.parseInt(s,8);
    }
    @Override public Integer visitNumber3(calcParser.Number3Context ctx){
        String s = ctx.Hexadecimal_const().getText();
        return Integer.parseInt(s.substring(2),16);
    }

}