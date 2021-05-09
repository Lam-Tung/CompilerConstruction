package lexer;

public enum TokenType {

    // Keywords
    Package("package"),
    Func("func"),
    Var("var"),
    Main("main"),
    // Identifier
    Identifier("Identifier"),

    // Literal terminator symbols
    LeftParen("LeftParen"),
    RightParen("RightParen"),
    LeftBrace("LeftBrace"),
    RightBrace("RightBrace"),
    LeftBrack("LeftBrack"),
    RightBrack("RightBrack"),
    Equals("EqualsSign"),

    // Number
    Number("Number"),
    // EOF
    EOF("EOF")
    ;

    private String value;

    TokenType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
