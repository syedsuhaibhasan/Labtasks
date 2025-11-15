package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class LL {
    int size;
    Node first=null;
    Node last=null;
    public LL(){
       this.size=0; 
    }
    class Node{
     int val;
     Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
            
        }
        
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public Node get(int index){
    Node temp = first;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
        
    public int find(int val){
    Node temp = first;
    int count = 0;
    while(temp!=null){
        if (temp.val==val) {
            System.out.print("The element was found at: ");
            return count+1;
        }
        temp=temp.next;
        count++;
    }   
        System.out.println("Element not found.");
        return -1;
    }
    
    public void displayForward(){
    Node temp = first;
    while(temp!=null){
        System.out.print(temp.val+"-->");
        temp=temp.next;
    }
        System.out.println("NULL");
    }
    
    
    public void deleteFirst(){
    first=first.next;
    size--;
    }
    
    public void deleteLast(){
    Node secondlast = get(size-2);
    last = secondlast;
    secondlast.next=null;
    size--;
    }
    
    public void deleteAt(int index){
        if (index==0) {
            deleteFirst();
            return;
        }else if (index==size) {
            deleteLast();
            return;
        }else{
            Node temp = get(index-2);
            temp.next=temp.next.next;
            size--;
        }
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
    
    public void addLast(int val){
    Node node = new Node(val);
        if (last==null) {
            first=last=node;
        }
        else{
        last.next=node;
        last=node;
        }
        size++;
    }
    
    public void insertAt(int val, int index){
        if (index==0) {
            addFirst(val);
            return;
        }else if (index==size) {
           addLast(val);
           return;
        }
        else{
            Node temp = get(index-2);
            Node node = new Node(val,temp.next);
            temp.next=node;
            size++;
        }    
    }
}


