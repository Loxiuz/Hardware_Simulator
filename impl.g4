grammar impl;

start   : command* EOF;

command : IDENTIFIER '=' expr ';'       # Assignment
	| 'while' '(' condition ')' block   # While
	| '.inputs' IDENTIFIER              # Input
    | '.outputs' IDENTIFIER*            # Output
    | '.latch'                          # Latch
    | '.update'                         # Update
    | '.simulate'                       # Simulate
	;
	
block : '{' command* '}'
      | command
      ;

condition : expr ('>'|'<'|'=='|'!='|'&&') expr
          | '!' expr
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

