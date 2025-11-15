package labtask.lab03;
public class Labtask03g {
    class stack{
    int top;
    int arr[];
    
    stack(int size){
    this.arr=new int[size];
    this.top=-1;  
    }
    
    public void push(int data){
        if (top==arr.length-1) {
            System.out.println("STACK OVERFLOW");
        }else{
            arr[++top]=data; //corrected
        }                   //previous arr[top++]
    }
    
    public int peek(){
        if (top==-1) {
            System.out.println("Stack is Empty");
        }
        return arr[top];
    }
    
    public int pop(){
        if (top==-1) {
            System.out.println("STACK UNDERFLOW");
        }
        return arr[top--];
    }
    
    boolean isEmpty() {
            return top == -1;
        }
    
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]+"");
        }
        System.out.println("");
    }
    }
    public void greaterElementChecker(int[] arr){
        stack stacks = new stack(arr.length);
        for (int i = 0; i < arr.length; i++) {
            while(!stacks.isEmpty() && arr[i]>stacks.peek()){
            int element = stacks.pop();
                System.out.println(element+"->"+arr[i]);
            }
            stacks.push(arr[i]);
        }
        while(!stacks.isEmpty()){
        int element = stacks.pop();
            System.out.println(element+"-> -1");
        }
    }
    
    public static void main(String[] args) {
        Labtask03g obj = new Labtask03g();
        int[] arr = {4,5,9,2,25};
        obj.greaterElementChecker(arr);
    }
}
