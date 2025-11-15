package labtask.lab03;
public class Labtask03e extends InfixToPostfix{
    public static void main(String[] args) {
        String str = "A+B/C*(E-D)+C^F*Z";
        Labtask03e obj = new Labtask03e(str.length());
        obj.infixToPostfix(str);
    }

    public Labtask03e(int size) {
        super(size);
    }
}
