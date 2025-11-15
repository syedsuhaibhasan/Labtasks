package labtask.lab03;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtask03b {
    int top;
    int arr[] = new int[5];
    
    Labtask03b(){
    this.top=-1;  //corrected 
                  //previous top=(0)
    }
    
    public void push(int data){
        if (top==arr.length) {
            System.out.println("STACK OVERFLOW");
        }else{
            arr[++top]=data; //corrected
        }                   //previous arr[top++]
    }
    
    public void pop(){
        if (top==-1) {
            System.out.println("STACK UNDERFLOW");
        }
        else{
            System.out.println("Element popped: "+arr[top--]);   
        }
    
    }
    
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]+"");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Labtask03b obj = new Labtask03b();
        obj.push(0);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.print();
        obj.pop();
        obj.print();
    }
}
