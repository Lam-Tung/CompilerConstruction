package parser;

import lexer.Lexer;
import lexer.Token;
import lexer.TokenType;

import java.util.ArrayList;

public class parser {
    /**
     * Local lexer to be defined using the file path, that's being checked by this parser.
     */
    Lexer lex ;
    /**
     * current token being processed by the parser
     */
    Token c_token ;
    /**
     * the root node that will represent the AST of this file
     */
    treeNode root;
    /**
     * @brief class constructor , will take filepath and create local lexer and check the syntax
     * @param path path of the file to check relative to the project root
     */
    public parser(String path){
        lex = new Lexer(path);
        c_token = lex.nxtToken();
        if(input()) {
            cerr("Syntax checked successfully !!");
            cerr("AST :");
            root.print("");
            lex.printSymbolTable();
        }
        else cerr("Please Fix the Syntax Errors !!");
    }

    /**
     * @brief input function follows the defined Grammer :
     input -> P M F* EOF
     p -> 'package' Identifier
     M -> 'func' 'main' '(' ')' '{' E '}'
     F -> 'func' Identifier '(' ')' '{' E '}'
     E -> 'var' Identifier Equals Number | £
     * @return boolean value indicating if the syntax checking was successfull
     */
    boolean input(){
        root = new treeNode("root");
        if(!p_chk(root)) {
            cerr("Package Error !!"); return false;
        }
        if(!m_chk()) {
            cerr("Main Function Error !!"); return false;
        }
        boolean no_ft_errors =true;
        while(c_token.getType()!=TokenType.EOF){
            no_ft_errors= no_ft_errors && f_chk(root);
            if(!no_ft_errors)break;
        }
        return no_ft_errors;
    }

    /**
     * @brief checks the package declaring syntax
     * @return true if the syntax is correct , false otherwise
     */
    boolean p_chk(treeNode mother){
        treeNode left = new treeNode("package_dec");
        if(c_token.getType()!=TokenType.Package) {
            cerr("Semantic Error : Package not declared. Please provide working package !");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.Identifier && c_token.getType()!=TokenType.Main){
            cerr("Semantic Error : Package name missing. Expected Package packagename or Package main!");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        mother.addRightNode(left);
        return true;
    }

    /**
     * @brief runs through the lexer to get all the function_names
     * @return true if at least 1 main function exists , false if no functions exist
     */
    boolean m_chk(){
        ArrayList<Token> iden = lex.getFuncIdent();
        if(iden.isEmpty()) {
            cerr("Semantic Error : No Functions were found. Please Provide a main function");
            return false;
        }
        for(Token t :iden)
            if(t.getType()==TokenType.Main) return true;
        cerr("Semantic Error : Main Function not found. Please Provide a main function !") ;
        return false;
    }

    /**
     * @brief checks the function syntax according to the defined Grammar :
     F -> 'func' Identifier '(' ')' '{' E '}'
     * @return true if the syntax is correct , false otherwise
     */
    boolean f_chk(treeNode mother){
        treeNode left = new treeNode("function_dec");
        if(c_token.getType()!=TokenType.Func) {
            cerr("Syntax Error : Function keyword missing. Expected func f_name !");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.Identifier && c_token.getType()!=TokenType.Main){
            cerr("Syntax Error : Function name missing. Expected func f_name or func main!");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.LeftParen){
            cerr("Syntax Error : Function body error. Expected func f_name() {} !");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.RightParen){
            cerr("Syntax Error : Open left paren '(' !");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.LeftBrace){
            cerr("Syntax Error : Function body error. Missing Braces {}!");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        if(!lex.chk_braces()) {
            cerr("Syntax Error : open left Brace !!");
            return false;
        }
        c_token = lex.nxtToken();
        boolean no_body_errors = true;
        while(c_token.getType()!=TokenType.RightBrace){
            no_body_errors = no_body_errors && e_chk(left);
            if(!no_body_errors) break;
        }
        if(!no_body_errors) return false;
        //exited the function body
        c_token = lex.nxtToken();
        mother.addRightNode(left);
        return true;
    }

    /**
     * @brief checks if the syntax of the expression is correct according to the defined Grammar :
     E -> 'var' Identifier Equals Number | £
     * @return true or false depending on the expression correctness
     */
    boolean e_chk(treeNode mother){
        treeNode left = new treeNode("expression");
        if(c_token.getType()!=TokenType.Var) {
            cerr("error at token :\t"+c_token.getValue()+"\nSyntax Error : Variable keyword missing. Expected var variable_name !");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.Identifier){
            cerr("error at token :\t"+c_token.getValue()+"\nSyntax Error : Variable name missing. Expected var variable_name !");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.Equals){
            cerr("error at token :\t"+c_token.getValue()+"\nSyntax Error : Variable declaration error. Expected var variable_name = value !");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        if(c_token.getType()!=TokenType.Number){
            cerr("error at token :\t"+c_token.getValue()+"\nSyntax Error : Variable declaration error. value should be a number!");
            return false;
        }
        left.addRightNode(new treeNode(c_token));
        c_token = lex.nxtToken();
        mother.addRightNode(left);
        return true;
    }

    /**
     * @brief replaces the annoying java 5 words long output command
     * @param s string to be printed
     */
    void cerr(String s){
        System.out.println(s);
    }
}
