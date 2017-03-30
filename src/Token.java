/**
 * Created by cobra on 3/30/2017.
 */
public class Token {
    private TType type;
    private String val;

    public Token(TType type, String val) {
        this.type = type;
        this.val = val;
    }

    public TType getType() {return type; }
    public String getVal() { return val; }
}
