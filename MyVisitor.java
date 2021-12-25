import java.util.HashMap;
import java.util.Map;
/*
//parser
compUnit:funcDef;

funcDef:FuncType Ident '(' ')' block;

block:'{' stmt '}';

stmt:'return' number ';';

number: Decimal_const #number1
|Octal_const #number2
|Hexadecimal_const #number3
;

//lexer
Digit:'0' | Nonzero_digit;
Hexadecimal_const: Hexadecimal_prefix Hexadecimal_digit+;
Octal_const: '0' Octal_digit*;
Decimal_const: Nonzero_digit Digit*;
WS:(' '|'\t'|'\n'|'\r')+{skip();};
FuncType:'int';
Ident:'main';
Hexadecimal_prefix:'0x'|'0X';
Nonzero_digit:'1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
Octal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
Hexadecimal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
                                        | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'
                                        | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

 */
public class MyVisitor extends calcBaseVisitor<Integer>{
    Map<String, Integer> memory = new HashMap<String, Integer>();

    //funcDef:FuncType Ident '(' ')' block;
    @Override public Integer visitFuncDef(calcParser.FuncDefContext ctx) {
        String funcName = ctx.Ident().getText();
        System.out.print("define dso_local i32 @");
        System.out.print(funcName);
        System.out.println("()");
        visit(ctx.block());
        return 0;
    }

    //block:'{' stmt '}';
    @Override public Integer visitBlock(calcParser.BlockContext ctx){
        System.out.println('{');
        visit(ctx.stmt());
        System.out.println('}');
        return 0;
    }

    //stmt:'return' number ';';
    @Override public Integer visitStmt(calcParser.StmtContext ctx) {
        System.out.print('\t'+"ret ");
        return super.visitStmt(ctx);
    }

    /*
    number: Decimal_const #number1
    |Octal_const #number2
    |Hexadecimal_const #number3
    ;
     */
    @Override public Integer visitNumber1(calcParser.Number1Context ctx){

        System.out.print("i32 ");
        String s = ctx.Decimal_const().getText();
        System.out.println(Integer.parseInt(s,10));
        return 0;
    }

    //octal_const
    @Override public Integer visitNumber2(calcParser.Number2Context ctx){

        System.out.print("i32 ");
        String s = ctx.Octal_const().getText();
        System.out.println(Integer.parseInt(s,8));
        return 0;
    }

    //hexadecimal_const

    @Override public Integer visitNumber3(calcParser.Number3Context ctx){
        System.out.print("i32 ");
        String s = ctx.Hexadecimal_const().getText();
        System.out.println(Integer.parseInt(s.substring(2),16));
        return 0;
    }

}