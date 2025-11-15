package labtask.lab02;
public class LL6 {
    int size;
    LL6(){
    this.size=0;
    }
    Node first=null;
    Node last=null;
    class Node{
    Node next;
    Node prev;
    int val;
    Node(int val){
    this.val=val;
    this.next=null;
    this.prev=null;
    }
    }
    public Node get(int index){
    Node temp = first;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    
    public void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next=first;
        newNode.prev=null;
        if (first!=null) {
             first.prev=newNode;
        }
        first=newNode;
        size++;
    }
    
    public void deleteDuplicate(){
    Node temp = first;
    while(temp.next!=null){
        if (temp.val==temp.next.val) {
            temp.next=temp.next.next;
            size--;
        }
     temp=temp.next;
    }
    last=temp;
    last.next=null;
    }
    
     public void display(){
    Node temp = first;
    while(temp!=null){
        System.out.print(temp.val+"-->");
        temp=temp.next;
        }
        System.out.print("NULL\n");
    }
}
