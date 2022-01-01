grammar calc;

compUnit:(gdecl)*funcDef;

//下面是用于全局变量的文法定义，目的是为了const init val 获得计算出来的值而不是虚拟寄存器。
gdecl: constdecl #gdecl1
       |gvarDecl #gdecl2;
gvarDecl: BType gvarDef (',' gvarDef)* ';';
gvarDef: Ident('['constExp']')*#gvarDef1|
         Ident ('['constExp']')*'='constInitval#gvarDef2;
//上面是用于全局变量的文法定义，目的是为了const init val 获得计算出来的值而不是虚拟寄存器。
//我尼玛快被写的煞笔东西恶心死了。

decl:   constdecl #decl1
        |varDecl #decl2;
constdecl: 'const' BType constDef ( ',' constDef )* ';';
constDef:Ident ('['constExp']')* '=' constInitval;

//constinitval
constInitval: constExp #constInitval1
              |'{' ( constInitval ( ',' constInitval )* )? '}' #constInitval2;

//为了将常量表达式直接求值不得不重一大段文法、真麻烦。
constExp:cAddExp;
cAddExp: cMulExp#cAddExp1|
        cAddExp UnaryOp cMulExp#cAddExp2;//('+'|'-')
cMulExp: cUnaryExp #cMulExp1|
        cMulExp MulOp cUnaryExp #cMulExp2;
cUnaryExp:cPrimaryExp #cUnaryExp1|
           UnaryOp cUnaryExp #cUnaryExp2;
cPrimaryExp : '(' constExp ')' #cPrimaryExp1|
                number #cPrimaryExp2|
                lVal #cPrimaryExp3;
// 为了将常量表达式直接求值不得不重一大段文法、真麻烦。至此所有的常量的对应键值就是实际的val 而不是虚拟寄存器reg

varDecl:BType varDef (',' varDef)* ';';
varDef:Ident ('['constExp']')* #varDef1|
       Ident('['constExp']')* '='initVal #varDef2;
initVal:exp #initVal1|
        '{' ( initVal ( ',' initVal )* )? '}'#initVal2;

funcDef:BType Ident '(' ')' block ;
funcRParams: exp (',' exp)*;

block:'{' blockItem* '}';
blockItem:decl#blockItem1|
          stmt#blockItem2;
stmt:   lVal'='exp';' #stmt1|
        (exp)? ';'#stmt2|
        'if' '(' cond ')'stmt ( 'else' stmt )?#stmt3|
         block  #stmt4|
         'while' '(' cond ')' stmt#stmt5|
         'break' ';'#stmt6|
         'continue' ';'#stmt7|
        'return' exp ';'#stmt8;
exp: addExp;
cond:lOrExp;
lOrExp: lAndExp #lOrExp1
        |lOrExp'||'lAndExp #lOrExp2;
lAndExp:eqExp   #lAndExp1
        |lAndExp'&&'eqExp   #lAndExp2;
eqExp:relExp    #eqExp1
        |eqExp EqOp relExp     #eqExp2;
relExp:addExp   #relExp1
        |relExp CmpOp addExp  #relExp2;

lVal: Ident ('['exp']')*;
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



number: number1|number2|number3;
number1: Decimal_const;
number2: Octal_const;
number3: Hexadecimal_const;

BType:'int';
UnaryOp: '+'|'-'|'!';
MulOp:'*'|'/'|'%';
EqOp:'!='|'==';
CmpOp:'<'|'>'|'<''='|'>''=';
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
