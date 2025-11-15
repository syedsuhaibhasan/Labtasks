package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192

import java.util.Scanner;

public class Labtask02b {
    public static void main(String[] args) {
        System.out.println("    LAB TASK 02 QUESTION NO. 2");
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index you want to delete: ");
        int index=sc.nextInt();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(7);
        System.out.println("\nBEFORE DELETION");
        list.displayForward();
        System.out.println("\nAFTER DELETION");
        list.deleteAt(index);
        list.displayForward();
    }
}
