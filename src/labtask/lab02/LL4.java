package labtask.lab02;
public class LL4 {
    int size;
    LL4(){
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
    public void addFirst(int val){
        Node node = new Node(val);
        node.next=first;
        node.prev=null;
        if (first!=null) {
            first.prev=node;
        }
        first=node;
        size++;
    }
    
    public void addLast(int val){
        Node node = new Node(val);
        last.next=node;
        last=node;
        size++;
    }
    
    public void insertAt(int val, int index){
        if (index==0) {
            addFirst(val);
            return;
        }
        else if (index==size) {
            addLast(val);
            return;
        }
        else{
            Node temp=first;
            for (int i = 1; i < index-1; i++) {
                temp=temp.next;
            }
            Node node = new Node(val);
            node.next=temp.next;
            temp.next=node;
            node.prev=temp;
        }
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
