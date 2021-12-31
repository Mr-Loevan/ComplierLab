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

import java.sql.SQLOutput;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
public class MyVisitor extends calcBaseVisitor<Integer>{
    String blockName="VRegisters";
    //public static boolean isGlobal  = true;
    Map<String, Integer> memory = new HashMap<>();
    VarTable varTable = new VarTable();
    VarTable constVarTable = new VarTable();
//    Map<String, Integer> varTable = new HashMap<>();
//    Map<String, Integer> constVarTable = new HashMap<>();


    public MyVisitor(){
        varTable.pushIn();//最低层存放全局变量
        constVarTable.pushIn();
        memory.put(blockName,0);
        //System.out.println("clear the block");
    }

    @Override public Integer visitFuncDef(calcParser.FuncDefContext ctx) {
        String funcName = ctx.Ident().getText();
        System.out.print("define dso_local i32 @");
        System.out.print(funcName);
        // TODO: 2021/12/31 在这里的blockname 不能再是所谓的funcname了
//        blockName = funcName;
//        memory.put(blockName,0);
        System.out.println("()");
        System.out.println("{");
        visit(ctx.block());
        System.out.println("}");
        return 0;
    }

    @Override public Integer visitBlock(calcParser.BlockContext ctx){
        varTable.pushIn();
        constVarTable.pushIn();
        ctx.blockItem().forEach(blockItemContext -> {visit(blockItemContext);});
//        System.out.println('}');
        varTable.popOut();
        constVarTable.popOut();
        return 0;
    }
//    cond:lOrExp;
//    lOrExp: lAndExp #lOrExp1
//        |lOrExp'||'lAndExp #lOrExp2;
//lorExp lAndExp cond 最终都是i1
    @Override
    public Integer visitCond(calcParser.CondContext ctx) {
        return visit(ctx.lOrExp());
    }

    @Override
    public Integer visitLOrExp1(calcParser.LOrExp1Context ctx) {
        return visit(ctx.lAndExp());
    }

    @Override
    public Integer visitLOrExp2(calcParser.LOrExp2Context ctx) {
        int l = visit(ctx.lOrExp());
        int r = visit(ctx.lAndExp());
        int reg = memory.get(blockName);
        reg++;
        memory.put(blockName,reg);//nt wrong
        System.out.printf("%%x%d = or i1 %%x%d,%%x%d\n",reg,l,r);//要求左右均是i1
        return reg;
    }
    //    lAndExp:eqExp   #lAndExp1
//        |lAndExp'&&'eqExp   #lAndExp2;
    @Override
    public Integer visitLAndExp1(calcParser.LAndExp1Context ctx) {
        int val = visit(ctx.eqExp());
        int reg = memory.get(blockName);
        reg++;
        memory.put(blockName,reg);
        System.out.printf("%%x%d = icmp eq i32 1, %%x%d\n",reg,val);
        return reg;
    }

    @Override
    public Integer visitLAndExp2(calcParser.LAndExp2Context ctx) {
        int l = visit(ctx.lAndExp());
        int r = visit(ctx.eqExp());
        int reg = memory.get(blockName);
        reg++;
        memory.put(blockName,reg);
        System.out.printf("%%x%d = icmp eq i32 1, %%x%d\n",reg,r);
        int new_reg = memory.get(blockName);new_reg++;
        memory.put(blockName,new_reg);
        System.out.printf("%%x%d = and i1 %%x%d,%%x%d\n",new_reg,l,reg);
        return new_reg;
    }
    //    eqExp:relExp    #eqExp1
//        |eqExp EqOp relExp     #eqExp2;
//    eqExp都是i32
    @Override
    public Integer visitEqExp1(calcParser.EqExp1Context ctx) {
        return visit(ctx.relExp());
    }

    @Override
    public Integer visitEqExp2(calcParser.EqExp2Context ctx) {
        String s = ctx.EqOp().getText();
        int l = visit(ctx.eqExp());
        int r = visit(ctx.relExp());
        int reg1,reg2;
        reg1 = memory.get(blockName);
        reg1++;
        memory.put(blockName,reg1);
        reg2 = memory.get(blockName);
        reg2++;
        memory.put(blockName,reg2);
        switch (s){
            case "==":
                System.out.printf("%%x%d = icmp eq i32 %%x%d, %%x%d\n",reg1,l,r);
                break;
            case "!=":
                System.out.printf("%%x%d = icmp ne i32 %%x%d, %%x%d\n",reg1,l,r);
                break;
        }
        System.out.printf("%%x%d = zext i1 %%x%d to i32\n",reg2,reg1);
        return reg2;
    }
    //    relExp:addExp   #relExp1
//        |relExp CmpOp addExp  #relExp2;
//    relExp 都是i32
//    CmpOp:'<'|'>'|'<''='|'>''=';
    @Override
    public Integer visitRelExp1(calcParser.RelExp1Context ctx) {
        return visit(ctx.addExp());
    }

    @Override
    public Integer visitRelExp2(calcParser.RelExp2Context ctx) {
        int l = visit(ctx.relExp());
        int r = visit(ctx.addExp());
        int reg_1 = memory.get(blockName);
        reg_1++;
        memory.put(blockName,reg_1);
        String s = ctx.CmpOp().getText();
        switch (s){
            case "<":
                System.out.printf("%%x%d = icmp slt i32 %%x%d, %%x%d\n",reg_1,l,r);
                break;
            case "<=":
                System.out.printf("%%x%d = icmp sle i32 %%x%d, %%x%d\n",reg_1,l,r);
                break;
            case ">":
                System.out.printf("%%x%d = icmp sgt i32 %%x%d, %%x%d\n",reg_1,l,r);
                break;
            case ">=":
                System.out.printf("%%x%d = icmp sge i32 %%x%d, %%x%d\n",reg_1,l,r);
                break;
            default:
                System.exit(-1);
        }
        int reg_2 = memory.get(blockName);
        reg_2++;
        memory.put(blockName,reg_2);
        System.out.printf("%%x%d = zext i1 %%x%d to i32\n",reg_2,reg_1);
        return reg_2;
    }

    //    stmt:   lVal'='exp';' #stmt1|
    //        (exp)? ';'#stmt2|
    //        'if' '(' cond ')'stmt ( 'else' stmt )?#stmt3|
    //         block  #stmt4|

    //         'break' ';'#stmt6|
    //         'continue' ';'#stmt7|
    //        'return' exp ';'#stmt8;
    //todo 所有和lval有关的都要改@形式 
    // TODO: 2021/12/31 已解决 改变所有lval
    //todo 不知道为什么reg增长数有奇怪。
    // TODO: 2021/12/31 已解决，之前在funcname时会有重新定义blockname。不需要
    @Override
    public Integer visitStmt8(calcParser.Stmt8Context ctx) {
        System.out.println("ret i32 %x"+visit(ctx.exp()));
        return 0;
    }
    //         'while' '(' cond ')' stmt #stmt5|
    @Override
    public Integer visitStmt5(calcParser.Stmt5Context ctx) {
        int reg = memory.get(blockName);reg++;
        memory.replace(blockName,reg);
        System.out.printf("br label %%x%d\n\n",reg);
        System.out.printf("x%d:\n",reg);
        int ret = visit(ctx.cond());
        int loopin = memory.get(blockName);loopin++;memory.replace(blockName,loopin);
        int loopout = memory.get(blockName);loopout++;memory.replace(blockName,loopout);
        System.out.printf("br i1 %%x%d, label %%x%d, label %%x%d\n\n",ret,loopin,loopout);
        System.out.printf("x%d:\n",loopin);
        visit(ctx.stmt());
        System.out.printf("br label %%x%d\n\n",reg);
        System.out.printf("x%d:\n",loopout);
        return 0;
    }

    @Override
    public Integer visitStmt3(calcParser.Stmt3Context ctx) {
        int seg = ctx.stmt().size();
        switch (seg){
            case 1:
                int ret = visit(ctx.cond());
                int reg_1 = memory.get(blockName);
                reg_1++;
                memory.put(blockName,reg_1);
                int reg_2 = memory.get(blockName);
                reg_2++;
                memory.put(blockName,reg_2);
                System.out.printf("br i1 %%x%d ,label %%x%d,label %%x%d\n\n",ret,reg_1,reg_2);
                System.out.printf("x%d:\n",reg_1);
                visit(ctx.stmt(0));
                System.out.printf("br label %%x%d\n\n",reg_2);
                System.out.printf("x%d:\n",reg_2);
                break;
            case 2:
                int case2_ret = visit(ctx.cond());
                int case2_reg_1 = memory.get(blockName);
                case2_reg_1++;
                memory.put(blockName,case2_reg_1);
                int case2_reg_2 = memory.get(blockName);
                case2_reg_2++;
                memory.put(blockName,case2_reg_2);
                int case2_reg_3 = memory.get(blockName);
                case2_reg_3++;
                memory.put(blockName,case2_reg_3);
                System.out.printf("br i1 %%x%d ,label %%x%d,label %%x%d\n\n",case2_ret,case2_reg_1,case2_reg_2);
                System.out.printf("x%d:\n",case2_reg_1);
                visit(ctx.stmt(0));
                System.out.printf("br label %%x%d\n\n",case2_reg_3);//nt wrong
                System.out.printf("x%d:\n",case2_reg_2);
                visit(ctx.stmt(1));
                System.out.printf("br label %%x%d\n\n",case2_reg_3);
                System.out.printf("x%d:\n",case2_reg_3);
                break;
        }
        return 0;
    }

    @Override
    public Integer visitStmt1(calcParser.Stmt1Context ctx) {//只会给变量赋值
        String s = ctx.lVal().getText();
        if(varTable.get(s)==null)
        {
            System.exit(-1);
            System.out.println("visitStmt1");
        }
        int reg = varTable.get(s);
        int l = visit(ctx.exp());
        if(varTable.isGlobal(s)){//全局变量的符号不一样
            System.out.printf("store i32 %%x%d, i32* @x%d\n",l,reg);
        }else{
            System.out.printf("store i32 %%x%d, i32* %%x%d\n",l,reg);
        }

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
       int reg = memory.get(blockName);
       if(varTable.getScope(s)==null&&constVarTable.getScope(s)==null){//在当前层符号表无
           reg++;
           memory.replace(blockName,reg);
           varTable.put(s,reg);
           System.out.printf("%%x%d = alloca i32\n",reg);
       }else {
           System.out.println("visitVarDef1");
           System.exit(-1);
       }
       return reg;
    }

    @Override
    public Integer visitVarDef2(calcParser.VarDef2Context ctx) {
        String s = ctx.Ident().getText();
        int val = visit(ctx.initVal());
        int reg = memory.get(blockName);
        if(varTable.getScope(s)==null&&constVarTable.getScope(s)==null){
            reg++;
            memory.replace(blockName,reg);
            varTable.put(s,reg);
            System.out.printf("%%x%d = alloca i32\n",reg);
            System.out.printf("store i32 %%x%d, i32* %%x%d\n",val,reg);
        }else {
            System.out.println("visitVarDef2");
            System.exit(-1);
        }
        return reg;
    }

//    gvarDef: Ident#gvarDef1|
//         Ident '='constInitval#gvarDef2;
// todo 解决了全局变量
    @Override
    public Integer visitGvarDef1(calcParser.GvarDef1Context ctx) {
        String s = ctx.Ident().getText();
        int reg = memory.get(blockName);
        if(varTable.getScope(s)==null&&constVarTable.getScope(s)==null){
            reg++;
            memory.replace(blockName,reg);
            varTable.put(s,reg);
            System.out.printf("@x%d = dso_local global i32 0\n",reg);
//            System.out.println("after global");
//            System.out.println(memory.get(blockName));
        }else{
            System.out.println("visitGvarDef1");
            System.exit(-1);
        }
        return reg;
    }

    @Override
    public Integer visitGvarDef2(calcParser.GvarDef2Context ctx) {
        String s = ctx.Ident().getText();

        //try{
        int reg = memory.get(blockName);
//        }catch (Exception e){
//            System.out.println("some thing wrong here");
//            System.exit(-1);
//        }

        if(varTable.getScope(s)==null&&constVarTable.getScope(s)==null){
            reg++;
            memory.replace(blockName,reg);
            varTable.put(s,reg);
            int val = visit(ctx.constInitval());
            System.out.printf("@x%d = dso_local global i32 %d\n",reg,val);
//            System.out.println("after global");
//            System.out.println(memory.get(blockName));
        }else{
            System.out.println("visitGvarDef2");
            System.exit(-1);
        }
        return reg;
    }

    //  initVal:exp;
    @Override
    public Integer visitInitVal(calcParser.InitValContext ctx) {
        return visit(ctx.exp());
    }
//  constdecl: 'const' BType constDef ( ',' constDef )* ';';
//constDef:Ident '=' constInitval;
//constInitval: constExp;
////为了将常量表达式直接求值不得不重一大段文法、真麻烦。
//constExp:cAddExp;
//cAddExp: cMulExp#cAddExp1|
//        cAddExp UnaryOp cMulExp#cAddExp2;//('+'|'-')
//cMulExp: cUnaryExp #cMulExp1|
//        cMulExp MulOp cUnaryExp #cMulExp2;
//cUnaryExp:cPrimaryExp #cUnaryExp1|
//           UnaryOp cUnaryExp #cUnaryExp2;
//cPrimaryExp : '(' constExp ')' #cPrimaryExp1|
//                number #cPrimaryExp2|
//                lVal #cPrimaryExp3;
//todo 解决了全局常量
    @Override
    public Integer visitConstDef(calcParser.ConstDefContext ctx) {
        String s = ctx.Ident().getText();
        int reg = visit(ctx.constInitval());
        if(varTable.getScope(s)==null&&constVarTable.getScope(s)==null){
            constVarTable.put(s,reg);
        }else{
            System.out.println("visitConstDef");
            System.exit(-1);
        }
        return reg;
    }

    @Override
    public Integer visitConstInitval(calcParser.ConstInitvalContext ctx) {
        return visit(ctx.constExp());
    }

//    @Override
//    public Integer visitExp(calcParser.ExpContext ctx) {
//        return visit(ctx.addExp());
//    }

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
        int time = memory.get(blockName);
        time++;
        memory.replace(blockName,time);
        switch (c){
            case "+":
                System.out.printf("%%x%d = add i32 %%x%d, %%x%d\n",time,l,r);
                break;
            case "-":
                System.out.printf("%%x%d = sub i32 %%x%d, %%x%d\n",time,l,r);
                break;
            default:
                System.out.println(c);
                System.out.println("visitAddExp2");
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
        int time = memory.get(blockName);
        time++;
        memory.replace(blockName,time);
        switch (c){
            case "*":
                System.out.printf("%%x%d = mul i32 %%x%d, %%x%d\n",time,l,r);
                break;
            case "/":
                System.out.printf("%%x%d = sdiv i32 %%x%d, %%x%d\n",time,l,r);
                break;
            case "%":
                System.out.printf("%%x%d = srem i32 %%x%d, %%x%d\n",time,l,r);
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
        int time = memory.get(blockName);
        time++;
        memory.replace(blockName,time);
        switch (op){
            case "+":
                System.out.printf("%%x%d = add i32 0, %%x%d\n",time,val);
                break;
            case "-":
                System.out.printf("%%x%d = sub i32 0, %%x%d\n",time,val);
                break;
            case "!":
                System.out.printf("%%x%d = icmp eq i32 0, %%x%d\n",time,val);
                int new_reg  = memory.get(blockName);
                new_reg++;
                memory.replace(blockName,new_reg);
                System.out.printf("%%x%d = zext i1 %%x%d to i32\n",new_reg,time);
                return new_reg;
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
                reg = memory.get(blockName);
//                System.out.println(memory.get(blockName));
                reg++;
                memory.replace(blockName,reg);
//                System.out.println("before call i32 getint");
//                System.out.println(reg);
                System.out.printf("%%x%d = call i32 @getint()\n",reg);
                break;
            case "putint":
                try{
                    ctx.funcRParams().exp().forEach(expContext -> {
                        params.add(visit(expContext));
                    });
                    System.out.printf("call void @putint(i32 %%x%d)\n", params.get(0));
                }catch (Exception e){
                    System.exit(-1);
                }
                break;
            case "getch":
                reg = memory.get(blockName);
                reg++;
                memory.replace(blockName,reg);
                System.out.printf("%%x%d = call i32 @getch()\n",reg);
                break;
            case "putch":
                try {
                    ctx.funcRParams().exp().forEach(expContext -> {
                        params.add(visit(expContext));
                    });
                    System.out.printf("call void @putch(i32 %%x%d)\n", params.get(0));
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
        int time = memory.get(blockName);
        time++;
        memory.replace(blockName,time);
        System.out.printf("%%x%d = add i32 0, %d\n",time,val);
        return time;
    }

    @Override
    public Integer visitPrimaryExp3(calcParser.PrimaryExp3Context ctx) {
        String s = ctx.lVal().getText();
        int reg = memory.get(blockName);
        reg++;
        if(varTable.get(s)!=null){
            int addr = varTable.get(s);
            memory.replace(blockName,reg);
            if(varTable.isGlobal(s)){
                System.out.printf("%%x%d = load i32, i32* @x%d\n",reg,addr);
            }else{
                System.out.printf("%%x%d = load i32, i32* %%x%d\n",reg,addr);
            }
        }else if(constVarTable.get(s)!=null){
            int val = constVarTable.get(s);
            memory.replace(blockName,reg);
            System.out.printf("%%x%d = add i32 0, %d\n", reg,val);
        }else {
            System.out.println("wrong here visitPrimaryExp3");
            System.exit(-1);
        }
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




    @Override public Integer visitConstExp(calcParser.ConstExpContext ctx){
        return visit(ctx.cAddExp());
    }



    /*
cPrimaryExp : '(' constExp ')' #cPrimaryExp1|
                number #cPrimaryExp2|
                lVal #cPrimaryExp3;
    */

    @Override
    public Integer visitCPrimaryExp1(calcParser.CPrimaryExp1Context ctx) {
        return visit(ctx.constExp());
    }

    @Override
    public Integer visitCPrimaryExp2(calcParser.CPrimaryExp2Context ctx) {
        return visit(ctx.number());
    }

    @Override
    public Integer visitCPrimaryExp3(calcParser.CPrimaryExp3Context ctx){
        String s = ctx.lVal().getText();
        if(constVarTable.get(s)!=null){
            return constVarTable.get(s);
        }else {
            System.out.println("visitCPrimaryExp3");
            System.exit(-1);
        }
        return 0;
    }
    /*
cUnaryExp:cPrimaryExp #cUnaryExp1|
           UnaryOp cUnaryExp #cUnaryExp2;
     */
    @Override public Integer visitCUnaryExp1(calcParser.CUnaryExp1Context ctx){
        return visit(ctx.cPrimaryExp());
    }

    @Override public Integer visitCUnaryExp2(calcParser.CUnaryExp2Context ctx){
        String op = ctx.UnaryOp().getText();
        switch (op){
            case "+":
                return visit(ctx.cUnaryExp());
            case "-":
                return -visit(ctx.cUnaryExp());
            default:
                System.exit(-1);
        }
        return 0;
    }


    /*
cAddExp: cMulExp#cAddExp1|
        cAddExp UnaryOp cMulExp#cAddExp2;//('+'|'-')
     */
    @Override
    public Integer visitCAddExp1(calcParser.CAddExp1Context ctx){
        return visit(ctx.cMulExp());
    }

    @Override
    public Integer visitCAddExp2(calcParser.CAddExp2Context ctx){
        String op = ctx.UnaryOp().getText();
        switch (op){
            case "+":
                return visit(ctx.cAddExp()) + visit(ctx.cMulExp());
            case "-":
                return visit(ctx.cAddExp()) - visit(ctx.cMulExp());
            default:
                System.out.println("visitCAddExp2");
                System.exit(-1);
        }
        return 0;
    }

    /*
constMulExp: constUnaryExp #constMulExp1|
    constMulExp MulOp constUnaryExp #constMulExp2;
    */
    @Override
    public Integer visitCMulExp1(calcParser.CMulExp1Context ctx){
        return visit(ctx.cUnaryExp());
    }

    @Override
    public Integer visitCMulExp2(calcParser.CMulExp2Context ctx){
        String op = ctx.MulOp().getText();
        return switch (op) {
            case "*" -> visit(ctx.cMulExp()) * visit(ctx.cUnaryExp());
            case "/" -> visit(ctx.cMulExp()) / visit(ctx.cUnaryExp());
            case "%" -> visit(ctx.cMulExp()) % visit(ctx.cUnaryExp());
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
    }


}