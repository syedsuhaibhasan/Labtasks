/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.lab03;

/**
 *
 * @author humai
 */
public class example {
    class stacks{
    int top;
    int[] arr;
    stacks(int size){
    this.arr=new int[size];
    this.top=-1;
    }
    
    public void push(int item){
        if (top==arr.length-1) {
            System.out.println("DTACK OVERFLOW");
        }
        else{
            arr[++top]=item;
        }
    }
    
    public int pop(){
        if (top==-1) {
            System.out.println("stack underflow"); 
        }
        return arr[top--];
    }
    
    boolean isEmpty(){
    return top==-1;
    }
    
    public int peek(){
        if (top==-1) {
            System.out.println("EMPTY STACK");
        }
        return arr[top];
    }
    }//END OF STACK CLASS
    
    public void NGE(int[] arr){
    stacks stack = new stacks(arr.length);
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i]>stack.peek()){
            int element = stack.pop();
                System.out.println(element+"->"+arr[i]);
            }
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
        int element = stack.pop();
            System.out.println(element+"-> -1");
                }
    }
    
    public static void main(String[] args) {
        example obj = new example();
        int[] arr = {4,5,9,2,25};
        obj.NGE(arr);
    }
}
