// Main.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream inputStream = null; // 获取输入流
            try {
                inputStream = CharStreams.fromStream(System.in);
            } catch (IOException e) {
                e.printStackTrace();
            }
            calcLexer lexer = new calcLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
            calcParser parser = new calcParser(tokenStream);
            ParseTree tree = parser.compUnit();
            MyVisitor myVisitor = new MyVisitor();
            myVisitor.visit(tree);
        }catch (Exception e){
            throw e;
        }
    }
}
