import java.util.ArrayList;

//This project heavily inspired by https://github.com/thejameskyle/the-super-tiny-compiler

public class Main {
    public static void main(String[] args) {
        ArrayList<Token> list = Tokenizer.tokenize("-120 `theLegend27` 23 fred_p doug () {} ");

        for(Token t : list) {
            System.out.println("Type: " + t.getType() + " Val: " + t.getVal());
        }
    }
}
