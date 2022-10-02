grammar impl;

start   : command* EOF;

command : IDENTIFIER '=' (condition | CONST)   # Assignment
	//| 'while' '(' condition ')' block        # While
	| '.hardware' IDENTIFIER                   # Hardware
	| '.inputs' IDENTIFIER                     # Input
    | '.outputs' IDENTIFIER*                   # Output
    | '.latch' IDENTIFIER '->' IDENTIFIER      # Latch
    | '.update'                                # Update
    | '.simulate'                              # Simulate
	;

/*block : '{' command* '}'
      | command
      ; */

condition : condition '&&' condition
          | '!' IDENTIFIER
          ;

//signal : ('0'|'1');

//update :  ;

//simulate :  ;

/*expr : expr ('*'|'/') expr
     | expr ('+'|'-') expr
     | '(' expr ')'
     | CONST
     | IDENTIFIER
     ; */

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-1]+;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

