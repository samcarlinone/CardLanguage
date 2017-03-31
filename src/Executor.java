import java.util.ArrayList;

/**
 * Created by cobra on 3/30/2017.
 */
public class Executor {
    private static int index;

    public static void execute(ArrayList<ASTNode> ast) {
        index = 0;

        walk(ast);
    }

    private static ASTNode walk(ArrayList<ASTNode> ast) {
        if(ast.get(index) instanceof CallExpression) {
            CallExpression c = (CallExpression) ast.get(index);

            
        }

        return null;
    }
}
