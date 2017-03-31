import java.util.ArrayList;

//This project heavily inspired by https://github.com/thejameskyle/the-super-tiny-compiler

public class Main {
    public static void main(String[] args) {
        ArrayList<Token> tokens = Tokenizer.tokenize("add(2, sub(1, rand())) mul(10, -1)");

        for(Token t : tokens) {
            System.out.println("Type: " + t.getType() + " Val: " + t.getVal());
        }

        Token[] nodes = new Token[tokens.size()];
        tokens.toArray(nodes);
        ArrayList<ASTNode> AST = Parser.parse(nodes);

        Executor.exe
    }
}
