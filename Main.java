// Main.java

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream inputStream = null;
            try {
                inputStream = CharStreams.fromStream(System.in);
            } catch (IOException e) {
                e.printStackTrace();
            }
            calcLexer lexer = new calcLexer(inputStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MyErrorListener());
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            calcParser parser = new calcParser(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(new MyErrorListener());

            ParseTree tree = parser.compUnit();
            MyVisitor myVisitor = new MyVisitor();
            System.out.println("declare i32 @getint()");
            System.out.println("declare void @putint(i32)");
            System.out.println("declare i32 @getch()");
            System.out.println("declare void @putch(i32)");
            myVisitor.visit(tree);
        }catch (Exception e){
            System.out.println(e);
            return;
        }
    }
}
