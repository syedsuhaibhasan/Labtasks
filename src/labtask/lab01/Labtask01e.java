package labtask.lab01;
import java.util.ArrayList;
import java.util.Random;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtask01e{
    public static void main(String[] args) {
        System.out.println("     LAB TASK QUESTION NO. 5");
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int value = rand.nextInt(100);
            list.add(value);
        }
        list.addFirst(10);
        list.addFirst(10);
        list.addFirst(10);
        System.out.println(list);
        list.add(5, 200);
        System.out.println(list);
        list.addLast(300);
        System.out.println(list);
        list.remove(5);
        list.removeLast();
        System.out.println(list);
    }
}
