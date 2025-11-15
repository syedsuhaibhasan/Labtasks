package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
import java.util.Scanner;
public class Labtask02a {
    public static void main(String[] args) {
        System.out.println("    LAB TASK 02 QUESTION NO. 1");
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to insert: ");
        int val=sc.nextInt();
        System.out.print("Enter the index: ");
        int index=sc.nextInt();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(7);
        System.out.println("\nWITHOUT INSERTION");
        list.displayForward();
        list.insertAt(val,index);
        System.out.println("\nAFTER INSERTION");
        list.displayForward();
    }
}
