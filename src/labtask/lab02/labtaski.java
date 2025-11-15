package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class labtaski {
    public static void main(String[] args) {
        System.out.println("  LAB TASK 02 QUESTION NO. 8");
        LL6 obj = new LL6();
        obj.addFirst(5);
        obj.addFirst(4);
        obj.addFirst(4);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addFirst(1);
        obj.display();
        obj.deleteDuplicate();
        obj.display();
    }
}
