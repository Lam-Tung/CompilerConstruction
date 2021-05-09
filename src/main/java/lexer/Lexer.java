package lexer;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lexer {
    private final ArrayList<Token> tokenList;

    public Lexer() {
        this.tokenList = new ArrayList<>();
    }

    /**
     * Generates tokens from given file
     * @param filePath the path to the file
     * @return list of tokens
     */
    public ArrayList<Token> generateTokens(String filePath) {
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
                        } else {
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

        return tokenList;
    }

    private boolean isParenBrackBrace(char c) {
        return c == '(' | c == ')' | c == '{' | c == '}' | c == '[' | c == ']';
    }
}
