package lexer;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lexer {
    private final ArrayList<Token> tokenList;
    private int token_idx =-1;
    public Lexer(String Path) {
        this.tokenList = new ArrayList<>();
        generateTokens(Path);
    }

    /**
     * Generates tokens from given file
     * @param filePath the path to the file
     * @return list of tokens
     */
    private void generateTokens(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                char[] charArray = line.toCharArray();
                int charArraySize = charArray.length;
                StringBuilder value = new StringBuilder();
                int index = 0;
                char lastChar;
                if(index < charArraySize) {
                    lastChar = charArray[index];
                } else {
                    continue;
                }

                while (index < charArraySize) {
                    while (Character.isWhitespace(lastChar)) { // Skip any whitespaces
                        index++;
                        lastChar = charArray[index];
                    }

                    if (Character.isLetter(lastChar)) { // identifier: [a-zA-Z][a-zA-Z0-9]*
                        value.append(lastChar);
                        index++;
                        lastChar = charArray[index];

                        while (Character.isLetterOrDigit(lastChar)) {
                            value.append(lastChar);
                            index++;
                            if(index < charArraySize) {
                                lastChar = charArray[index];
                            } else {
                                break;
                            }
                        }

                        if (value.toString().equals(TokenType.Package.getValue())) {
                            Token token = new Token(value.toString(), TokenType.Package);
                            tokenList.add(token);
                            value = new StringBuilder();
                        } else if (value.toString().equals(TokenType.Func.getValue())) {
                            Token token = new Token(value.toString(), TokenType.Func);
                            tokenList.add(token);
                            value = new StringBuilder();
                        } else if (value.toString().equals(TokenType.Var.getValue())) {
                            Token token = new Token(value.toString(), TokenType.Var);
                            tokenList.add(token);
                            value = new StringBuilder();
                        } else if (value.toString().equals(TokenType.Main.getValue())) {
                            Token token = new Token(value.toString(), TokenType.Main);
                            tokenList.add(token);
                            value = new StringBuilder();
                        } else {
                            Token token = new Token(value.toString(), TokenType.Identifier);
                            tokenList.add(token);
                            value = new StringBuilder();
                        }
                    }

                    if (isParenBrackBrace(lastChar)) {
                        value.append(lastChar);

                        switch (lastChar) {
                            case '(': {
                                Token token = new Token(value.toString(), TokenType.LeftParen);
                                tokenList.add(token);
                                value = new StringBuilder();
                                break;
                            }
                            case ')': {
                                Token token = new Token(value.toString(), TokenType.RightParen);
                                tokenList.add(token);
                                value = new StringBuilder();
                                break;
                            }
                            case '{': {
                                Token token = new Token(value.toString(), TokenType.LeftBrace);
                                tokenList.add(token);
                                value = new StringBuilder();
                                break;
                            }
                            case '}': {
                                Token token = new Token(value.toString(), TokenType.RightBrace);
                                tokenList.add(token);
                                value = new StringBuilder();
                                break;
                            }
                            case '[': {
                                Token token = new Token(value.toString(), TokenType.LeftBrack);
                                tokenList.add(token);
                                value = new StringBuilder();
                                break;
                            }
                            case ']': {
                                Token token = new Token(value.toString(), TokenType.RightBrack);
                                tokenList.add(token);
                                value = new StringBuilder();
                                break;
                            }
                        }

                        index++;
                        if(index < charArraySize) {
                            lastChar = charArray[index];
                        } else {
                            break;
                        }
                    }

                    if (Character.isDigit(lastChar)) { // Number: [0-9]+
                        value.append(lastChar);
                        index++;
                        if(index < charArraySize) {
                            lastChar = charArray[index];
                        } else {//single char numbers
                            Token token = new Token(value.toString(), TokenType.Number);
                            tokenList.add(token);
                            value = new StringBuilder();
                            continue;
                        }

                        while (Character.isDigit(lastChar)) {
                            value.append(lastChar);
                            index++;
                            if(index < charArraySize) {
                                lastChar = charArray[index];
                            } else {
                                break;
                            }
                        }

                        Token token = new Token(value.toString(), TokenType.Number);
                        tokenList.add(token);
                        value = new StringBuilder();
                    }

                    if (lastChar == '=') {
                        value.append(lastChar);
                        index++;
                        if(index < charArraySize) {
                            lastChar = charArray[index];
                        } else {
                            continue;
                        }
                        Token token = new Token(value.toString(), TokenType.Equals);
                        tokenList.add(token);
                        value = new StringBuilder();
                    }
                }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        tokenList.add(new Token("EOF",TokenType.EOF));
        return ;
    }

    private boolean isParenBrackBrace(char c) {
        return c == '(' | c == ')' | c == '{' | c == '}' | c == '[' | c == ']';
    }

    /**
     * @brief prints a list of the generated tokens , symbol table
     */
    public void printSymbolTable(){
        System.out.println("############### SYMBOL TABLE ##############");

        for(Token t : tokenList) System.out.println(t.getValue()+"\t:\t"+t.getType().getValue());
    }

    /**
     * @brief grabs the next token from the token list , index will be initialized at -1
     * @return next token in the list
     */
    public Token nxtToken(){
        token_idx++;
        return tokenList.get(token_idx);
    }

    /**
     * @brief goes over the list of token generated and generates a list of the tokens that come right
     * after the "func" token
     * @return list of the tokens posing as function identifiers, list will be processed later by the parser
     */
    public ArrayList<Token> getFuncIdent(){
        ArrayList<Token> iden = new ArrayList<>();
        for(Token t : tokenList){
            if(t.getType()==TokenType.Func) iden.add(tokenList.get(tokenList.indexOf(t)+1));
        }
        return iden;
    }

    /**
     * @brief goes over the list of token generated and count the sum of left and right braces
     * @return true if the number of opening braces matches the number of closing braces
     */
    public boolean chk_braces(){
        int left_counter=0;
        int right_counter=0;
        for(Token t :tokenList){
            if (t.getType()==TokenType.LeftBrace) left_counter++;
            if (t.getType()==TokenType.RightBrace) right_counter++;
        }
        return left_counter==right_counter;
    }
}
