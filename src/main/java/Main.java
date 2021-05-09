import parser.parser;

public class Main {
    public static void main(String[] args) {
        parser p ;
        System.out.println("\n\nchecking file : VarDeclaration.go ...");
        p=new parser("src/main/resources/go/VarDeclaration.go");
        System.out.println("\n\nchecking file : varErrors.go ...");
        p=new parser("src/main/resources/go/varErrors.go");
        System.out.println("\n\nchecking file : no_main.go ...");
        p=new parser("src/main/resources/go/no_main.go");
        System.out.println("\n\nchecking file : open_braces.go ...");
        p=new parser("src/main/resources/go/open_braces.go");
    }
}
