import java.util.ArrayList;

/**
 * Created by cobra on 3/30/2017.
 */
public class Parser {
    private static int index;

    public static ArrayList<ASTNode> parse(Token[] tokens) {
        ArrayList<ASTNode> result = new ArrayList<>();
        index = 0;

        while (index < tokens.length) {
            result.add(walk(tokens));
        }

        return result;
    }

    private static ASTNode walk(Token[] tokens) {
        Token t = tokens[index];

        if(t.getType() == TType.STRING) {
            index ++;

            return new StringLiteral(t.getVal());
        }

        if(t.getType() == TType.NUMBER) {
            index ++;

            return new NumberLiteral(t.getVal());
        }

        if(t.getType() == TType.NAME) {
            CallExpression c = new CallExpression(t.getVal());;

            index += 2;

            if(tokens[index].getType() == TType.PAREN && tokens[index].getVal().equals(")")) {
                index ++;
                return c;
            }

            while(t.getType() != TType.PAREN || (t.getType() == TType.PAREN && !t.getVal().equals(")"))) {
                c.params.add(walk(tokens));
                t = tokens[index];
            }

            index ++;
            return c;
        }

        System.out.println("A parsing error has occurred");
        index = tokens.length;
        return null;
    }
}
