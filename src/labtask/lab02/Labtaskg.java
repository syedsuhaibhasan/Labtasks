package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtaskg {
    public static void main(String[] args) {
        System.out.println("  LAB TASK 02 QUESTION NO 6");
        LL4 obj = new LL4();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addFirst(4);
        obj.addFirst(5);
        obj.addFirst(6);
        System.out.println("\nBEFORE INSERTION");
        obj.display();
        obj.insertAt(99, 4);
        System.out.println("\nAFTER INSERTION");
        obj.display();
    }
}
