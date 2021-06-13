// Define a grammar called goSubset
grammar goSubset;


// Rules
sourceFile: packageDecl mainDecl funcDecl* EOF ;
packageDecl: PACKAGE packageName = IDENTIFIER | PACKAGE packageName = 'main' ;
mainDecl: FUNC MAIN LEFTPAREN RIGHTPAREN LEFTBRACE expr* RIGHTBRACE ;
funcDecl: FUNC IDENTIFIER LEFTPAREN RIGHTPAREN LEFTBRACE expr* RIGHTBRACE ;
expr: varDecl | varAssign ;
varDecl :  varDecl_num | varDecl_var ;
varDecl_num : VAR IDENTIFIER EQUALS NUMBER;
varDecl_var : VAR IDENTIFIER EQUALS IDENTIFIER;
varAssign : varAssign_num | varAssign_var;
varAssign_num : IDENTIFIER EQUALS NUMBER;
varAssign_var : IDENTIFIER EQUALS IDENTIFIER;
// Tokens
PACKAGE: 'package' ;
FUNC: 'func' ;
VAR: 'var' ;
MAIN: 'main' ;
NUMBER: [0-9]+ ;
WHITESPACE: [ \r\n\t]+ -> skip;
LEFTPAREN: '(' ;
RIGHTPAREN: ')' ;
LEFTBRACE: '{' ;
RIGHTBRACE: '}' ;
LEFTBRACK: '[' ;
RIGHTBRACK: ']' ;
EQUALS: '=' ;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;

