import java.util.ArrayList;

/**
 * Created by cobra on 3/30/2017.
 */
public class CallExpression extends ASTNode {
    public String name;
    public ArrayList<ASTNode> params;

    public CallExpression(String name) {
        this.name = name;
        params = new ArrayList<>();
    }
}
