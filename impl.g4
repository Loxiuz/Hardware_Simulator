grammar impl;

start   : command* EOF;

command : IDENTIFIER '=' (expr | condition) # Assignment
	| 'while' '(' condition ')' block       # While
	| '.hardware' IDENTIFIER                # Hardware
	| '.inputs' IDENTIFIER                  # Input
    | '.outputs' IDENTIFIER*                # Output
    | '.latch' IDENTIFIER '->' IDENTIFIER   # Latch
    | '.update'                             # Update
    | '.simulate'                           # Simulate
	;

//signal : ('0'|'1');

//update :  ;

//simulate :  ;


block : '{' command* '}'
      | command
      ;

condition : '!' expr
          | expr ('>'|'<'|'=='|'!='|'&&') expr
          | condition '&&' condition
          ;

expr : expr ('*'|'/') expr
     | expr ('+'|'-') expr
     | '(' expr ')'
     | CONST
     | IDENTIFIER
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

