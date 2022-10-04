grammar impl;

start   : hardware inputs outputs latchDec update updateDec  simulate simlnp  EOF;



hardware: '.hardware' IDENTIFIER ;
inputs : '.inputs' IDENTIFIER  ;
outputs: '.outputs' IDENTIFIER ;
latchDec : '.latch' IDENTIFIER '->' IDENTIFIER;
update:  '.update' ;
updateDec: IDENTIFIER '=' expr  ;
simulate:'.simulate';
simlnp: IDENTIFIER '=' CONST;

condition : '!' expr
            |condition '&&' condition

          ;
expr : '(' expr ')'
     |  IDENTIFIER expr
     | '!' expr
   //  |expr '&&' expr
   |condition '&&' condition

     | CONST

    // | expr ('*'|'/') expr
    // | expr ('+'|'-') expr
     ;

//signal : ('0'|'1');

//update :  ;

//simulate :  ;


/* block : '{' command* '}'
      | command
      ; */

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

