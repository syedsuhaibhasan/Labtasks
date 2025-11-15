package labtask.lab02;
public class LL5 {
    int size;
    LL5(){
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
    public void addLast(int val){
        Node newNode = new Node(val);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }
    public void deleteFirst(){
    first=first.next;
    size--;
    }
    
    public void deleteLast(){
    last=last.prev;
    last.next=null;
    }
 public void delete(int val) {
    Node temp = first;
    while (temp != null && temp.val != val) {
        temp = temp.next;
    }
    if (temp == null) return;

    if (temp == first && temp == last) {
        first = last = null;
    } else if (temp == first) {
        first = first.next;
        if (first != null) first.prev = null;
        else last = null;
    } else if (temp == last) {
        last = last.prev;
        if (last != null) last.next = null;
        else first = null;
    } else {
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    temp.next = temp.prev = null;
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
