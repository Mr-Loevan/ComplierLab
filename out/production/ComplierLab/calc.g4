grammar calc;

compUnit:funcDef;
funcDef:FuncType Ident '(' ')' block;
block:'{' stmt '}';
stmt:'return' exp ';';
exp: addExp;
addExp: mulExp  #addExp1|
        addExp UnaryOp mulExp   #addExp2;
mulExp: unaryExp    #mulExp1|
        mulExp MulOp unaryExp #mulExp2;
unaryExp: primaryExp    #unaryExp1
        |UnaryOp unaryExp   #unaryExp2;
primaryExp: '('exp')'   #primaryExp1
        |number     #primaryExp2;
number: number1|number2|number3;
number1: Decimal_const;
number2: Octal_const;
number3: Hexadecimal_const;
UnaryOp: '+'|'-';
MulOp:'*'|'/'|'%';
Decimal_const: Nonzero_digit Digit*;
Octal_const: '0' Octal_digit*;
Hexadecimal_const: Hexadecimal_prefix Hexadecimal_digit+;
Hexadecimal_prefix:'0x'|'0X';
Nonzero_digit:'1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
Octal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
Digit:'0' | Nonzero_digit;
Hexadecimal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
                                        | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'
                                        | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';
WS:(' '|'\t'|'\n'|'\r')+{skip();};
FuncType:'int';
Ident:'main';
LINE_COMMENT:'//' .*? '\r'? '\n' -> skip;
COMMENT:'/*' .*? '*/' ->skip;
