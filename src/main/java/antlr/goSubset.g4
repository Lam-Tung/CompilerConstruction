// Define a grammar called goSubset
grammar goSubset;

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

// Rules
start: packageDecl mainDecl funcDecl* EOF ;
packageDecl: PACKAGE IDENTIFIER | PACKAGE 'main' ;
mainDecl: FUNC MAIN LEFTPAREN RIGHTPAREN LEFTBRACE expr* RIGHTBRACE ;
funcDecl: FUNC IDENTIFIER LEFTPAREN RIGHTPAREN LEFTBRACE expr* RIGHTBRACE ;
expr: VAR IDENTIFIER EQUALS NUMBER ;


