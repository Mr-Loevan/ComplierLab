grammar calc;

compUnit:funcDef;
funcDef:FuncType Ident '(' ')' block;
block:'{' stmt '}';
stmt:'return' number ';';
number: number1|number2|number3;
number1: Decimal_const;
number2: Octal_const;
number3: Hexadecimal_const;
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
