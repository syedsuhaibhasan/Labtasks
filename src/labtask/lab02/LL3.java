//for labtask02e
package labtask.lab02;
public class LL3 {
    Node first=null;
    Node last=null;
    class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val=val;
        this.next=null;
    }
   }//END OF NODE CLASS
    
    public void addFirst(int val){
    Node node = new Node(val);
        if (first==null) {
            first=last=node;
        }else{
    node.next=first;
    first=node;}
    }
    
    public void displayLL(){
    Node temp=first;
    while(temp!=null){
        System.out.print(temp.val+" -> ");
        temp=temp.next;
     }System.out.print("NULL");
    }
    
    public void countnode(){
    int count=0;
    Node temp=first;
    while(temp!=null){
    temp=temp.next;
    count++;
     }
        System.out.println("\nThe number of nodes in this linked List are: "+(count));
    } 
}
