package labtask.lab03;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtask03a {
    int top;
    int arr[] = new int[5];
    
    Labtask03a(){
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
    
    
    
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]+"");
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        Labtask03a obj = new Labtask03a();
        obj.push(0);
        obj.push(1);
        obj.print();
        
    }
}
