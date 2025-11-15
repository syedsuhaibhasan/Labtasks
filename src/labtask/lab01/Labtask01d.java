package labtask.lab01;
import java.util.ArrayList;
import java.util.Collections;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtask01d {
    ArrayList<Integer> list = new ArrayList<>();
    
    public void bubblesort(){
        for (int j = 0; j < list.size()-1; j++) {    
            for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)>list.get(i+1)) {
               int temp = list.get(i);
               list.set(i, list.get(i+1));
               list.set(i+1, temp);
            }
          }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("   LAB TASK QUESTION NO. 4");
        Labtask01d obj = new Labtask01d();
        obj.list.add(7);
        obj.list.add(0, 99999);
        Collections.addAll(obj.list, 19,28,37,46,55,64,73,82,91,10);
        obj.bubblesort();
        System.out.println(obj.list);
        int foundAt = Collections.binarySearch(obj.list, 73);
        System.out.println("The element is found at " +(foundAt)+ " index of list.");
    }
}
