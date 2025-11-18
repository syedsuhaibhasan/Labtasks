package labtask.lab03;
import java.util.*;

public class Labtask03e {
    public static int eval(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] arr = exp.split(" ");
        for (String s : arr) {
            if (s.matches("-?\\d+")) {
                st.push(Integer.parseInt(s));
            } else {
                int b = st.pop();
                int a = st.pop();
                int r = 0;
                if (s.equals("+")) r = a + b;
                else if (s.equals("-")) r = a - b;
                else if (s.equals("*")) r = a * b;
                else if (s.equals("/")) r = a / b;
                st.push(r);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(eval(x));
    }
}
