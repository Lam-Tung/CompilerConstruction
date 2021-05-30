package antlr;


import antlr.test.myVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.IOException;

public class Antlr_Parser {
    public static void main(String[] args) throws IOException{
        //lexer requires a charstream
        CharStream chars = CharStreams.fromFileName("src/main/java/antlr/test/VarDeclaration.go");
        goSubsetLexer go_lexer = new goSubsetLexer(chars);
        //getting the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(go_lexer);
        //creating a parser
        goSubsetParser go_parser = new goSubsetParser(tokens);
        //generating the parse tree
        ParseTree tree = go_parser.sourceFile();
        myVisitor visitor = new myVisitor();
        visitor.visit(tree);
        System.out.println("end");
    }
}