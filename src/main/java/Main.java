import lexer.Lexer;
import lexer.Token;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lexer lex = new Lexer();
        List<Token> list = lex.generateTokens("src/main/resources/go/VarDeclaration.go");
        for (Token t : list) {
            System.out.println(t.getValue() + ":" + t.getType().getValue());
        }
    }
}
