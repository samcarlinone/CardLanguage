/**
 * Created by cobra on 3/30/2017.
 */
public class NumberLiteral extends ASTNode {
    public int val = 0;

    public NumberLiteral(String val) {
        this.val = Integer.parseInt(val);
    }
}
