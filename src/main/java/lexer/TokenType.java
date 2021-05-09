package lexer;

public enum TokenType {

    // Keywords
    Package("package"),
    Func("func"),
    Var("var"),

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
    Number("Number")
    ;

    private String value;

    TokenType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
