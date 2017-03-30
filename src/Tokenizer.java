import java.util.ArrayList;

/**
 * Created by cobra on 3/30/2017.
 */
public class Tokenizer {
    public static ArrayList<Token> tokenize(String data) {
        ArrayList<Token> tokens = new ArrayList<>();

        int i = 0;

        while(i < data.length()) {
            String c = data.substring(i, i+1);

            //Skip Whitespace
            if(c.matches("\\s")) {
                i++;
                continue;
            }

            //Add Paren
            if(c.equals("(") || c.equals(")")) {
                tokens.add(new Token(TType.PAREN, c));
                i++;
                continue;
            }

            //Add brace
            if(c.equals("{") || c.equals("}")) {
                tokens.add(new Token(TType.BRACE, c));
                i++;
                continue;
            }

            //Add String using ` as delimiter
            if(c.equals("`")) {
                int s = ++i;

                while(!data.substring(i, ++i).equals("`")) {
                    //Keep Searching
                }

                tokens.add(new Token(TType.STRING, data.substring(s, i-1)));
                continue;
            }

            //Add Number
            String num = "[-\\d]";
            if(c.matches(num)) {
                int s = i;

                while(data.substring(i, ++i).matches(num)) {
                    //Keep Searching
                }

                tokens.add(new Token(TType.NUMBER, data.substring(s, i-1)));
                continue;
            }

            //Add Name ([a-zA-Z_0-9])
            String name = "[a-zA-Z_0-9]";
            if(c.matches(name)) {
                int s = i;

                while(data.substring(i, ++i).matches(name)) {
                    //Keep Searching
                }

                tokens.add(new Token(TType.NAME, data.substring(s, i-1)));
                continue;
            }

            System.err.println("Unrecognized char");
            return null;
        }

        return tokens;
    }
}
