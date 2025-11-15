package labtask.lab01;
public class Labtask01c {
    public static void main(String [] args) {
        System.out.println("      LAB TASK QUESTION NO. 3");
        Array obj = new Array(5);
        obj.insert(5);
        obj.insert(4);
        obj.insert(3);
        obj.insert(2);
        obj.insert(1);
        obj.displayarray();
        obj.removeAt(2);
        System.out.println("");
        obj.displayarray();
        int ans = obj.indexOf(3);
        System.out.println("");
        System.out.println(
            "Number found at "+(ans)+
            " index of array.");
        obj.updateAt(3, 88);
        System.out.println("");
        obj.displayarray();
    }
}
