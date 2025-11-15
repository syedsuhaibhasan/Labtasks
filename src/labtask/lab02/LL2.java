package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class LL2 {
    int size=0;
    Node first=null;
    Node last=null;
    LL2(){
    this.size=0;
    }
  
    class Node{
    Node next;
    int val;
    
    public Node(Node next, int val) {
        this.next = next;
        this.val = val;
        }
    
    public Node (int val) {
        this.next = null;
        this.val = val;
        }
    }
    
    public void displayForward(){
    Node temp = first;
    while(temp!=null){
        System.out.print(temp.val+"-->");
        temp=temp.next;
    }
        System.out.println("NULL");
    }
    
    public void addFirst(int val){
     Node node = new Node(val);
        if (first==null) {
            first=last=node;
        }
        else{
        node.next=first;
        first=node;
        }
        size++;
    }

}
