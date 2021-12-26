
public class MyVisitor extends calcBaseVisitor<Integer>{

    @Override public Integer visitFuncDef(calcParser.FuncDefContext ctx) {
        String funcName = ctx.Ident().getText();
        System.out.print("define dso_local i32 @");
        System.out.print(funcName);
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
        System.out.print('\t'+"ret ");
        return super.visitStmt(ctx);
    }
    @Override public Integer visitNumber1(calcParser.Number1Context ctx){

        System.out.print("i32 ");
        String s = ctx.Decimal_const().getText();
        System.out.println(Integer.parseInt(s,10));
        return 0;
    }
    @Override public Integer visitNumber2(calcParser.Number2Context ctx){

        System.out.print("i32 ");
        String s = ctx.Octal_const().getText();
        System.out.println(Integer.parseInt(s,8));
        return 0;
    }
    @Override public Integer visitNumber3(calcParser.Number3Context ctx){
        System.out.print("i32 ");
        String s = ctx.Hexadecimal_const().getText();
        System.out.println(Integer.parseInt(s.substring(2),16));
        return 0;
    }

}