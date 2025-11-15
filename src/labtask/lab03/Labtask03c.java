package labtask.lab03;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtask03c {
    Node top=null;
    class Node{
    int data;
    Node next;
    
    Node(int data){
    this.data=data;
    this.next=null;
        } 
    }
    
    public void push(int data){
        Node newNode = new Node(data);
        if (top==null) {
            top=newNode;
        }else{
        newNode.next=top;
        top=newNode;
        }
    }
    
    public void pop(){
        if (top==null) {                     //null pointer exception handled
            System.out.println("STACK UNDERFLOW!");
        }else{
            System.out.println("Popped item: "+top.data);
            top=top.next;
        }
    }
    
    public void print(){
     Node temp=top;
     while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
     }
    }
    
    public static void main(String[] args) {
     Labtask03c obj = new Labtask03c();
     obj.push(0);
     obj.push(1);
     obj.print();
     obj.pop();
     obj.pop();
     obj.pop();
    }    
}
