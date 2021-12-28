grammar calc;

compUnit:funcDef;
decl:   constdecl #decl1
        |varDecl #decl2;
constdecl: 'const' BType constDef ( ',' constDef )* ';';
constDef:Ident '=' constInitval;
constInitval: constExp;

varDecl:BType varDef (',' varDef)* ';';
varDef:Ident#varDef1|
       Ident '='initVal#varDef2;
initVal:exp;

funcDef:BType Ident '(' ')' block ;
funcRParams: exp (',' exp)*;

block:'{' blockItem* '}';
blockItem:decl#blockItem1|
          stmt#blockItem2;
stmt:   lVal'='exp';' #stmt1|
        (exp)? ';'#stmt2|
        'return' exp ';'#stmt3;
exp: addExp;

lVal: Ident;
primaryExp: '('exp')'   #primaryExp1
        |number     #primaryExp2
        |lVal       #primaryExp3;
unaryExp: primaryExp    #unaryExp1
        |UnaryOp unaryExp   #unaryExp2
        |Ident '('(funcRParams)?')' #unaryExp3;
mulExp: unaryExp    #mulExp1|
        mulExp MulOp unaryExp #mulExp2;
addExp: mulExp  #addExp1|
        addExp UnaryOp mulExp   #addExp2;

constExp:addExp;

number: number1|number2|number3;
number1: Decimal_const;
number2: Octal_const;
number3: Hexadecimal_const;

BType:'int';
UnaryOp: '+'|'-';
MulOp:'*'|'/'|'%';
Decimal_const: Nonzero_digit Digit*;
Octal_const: '0' Octal_digit*;
Hexadecimal_const: Hexadecimal_prefix Hexadecimal_digit+;
Hexadecimal_prefix:'0x'|'0X';
Nonzero_digit:'1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
Octal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
Digit:'0' | Nonzero_digit;
Ident:Nondigit (Digit|Nondigit)*;
Hexadecimal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
                                        | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'
                                        | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

Nondigit:'_'|[a-z]|[A-Z];

//FuncType:'int';
LINE_COMMENT:'//' .*? '\r'? '\n' -> skip;
COMMENT:'/*' .*? '*/' ->skip;
WS:(' '|'\t'|'\n'|'\r') -> skip;
