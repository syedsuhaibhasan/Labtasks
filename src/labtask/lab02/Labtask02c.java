package labtask.lab02;
import java.util.Scanner;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtask02c {
    public static void main(String[] args) {
        System.out.println("    LAB TASK 02 QUESTION NO. 3");
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to find: ");
        int val=sc.nextInt();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(7);
        list.displayForward();
        int ans = list.find(val);
        System.out.println(ans);
    }
}
