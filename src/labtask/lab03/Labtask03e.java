package labtask.lab03;
public class Labtask03e {
    public static void main(String[] args) {
        String str = "A+B/C*(E-D)+C^F*Z";
        InfixToPostfix obj = new InfixToPostfix(str.length());
        obj.infixToPostfix(str);
    }
}
