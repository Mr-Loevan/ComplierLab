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
public class MyVisitor extends calcBaseVisitor<Integer>{
    String blockname;
    Map<String, Integer> memory = new HashMap<>();
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
        visit(ctx.stmt());
        System.out.println('}');
        return 0;
    }

    @Override public Integer visitStmt(calcParser.StmtContext ctx) {
        System.out.println("ret i32 %"+visit(ctx.exp()));
        return 0;
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
                System.out.printf("%%x%d = mul i32 %%x%d, %%%d\n",time,l,r);
                break;
            case "/":
                System.out.printf("%%x%d = sdiv i32 %%x%d, %%%d\n",time,l,r);
                break;
            case "%":
                System.out.printf("%%x%d = srem i32 %%x%d, %%%d\n",time,l,r);
            default:
                System.out.println(c);
                System.exit(-1);
        }
        return time;
    }
    //        unaryExp: primaryExp    #unaryExp1
//        |UnaryOp unaryExp   #unaryExp2;

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

    //        primaryExp: '('exp')'   #primaryExp1
//        |number     #primaryExp2;

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