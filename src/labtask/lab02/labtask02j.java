package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class labtask02j {
    
    class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
            this.next = null;
    }
}
    Node head;
    
    public void sortInsertion(int val) {
        Node newNode = new Node(val);
        if(head == null || head.val >= newNode.val) {   //when list is empty or new node is smaller
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.val < newNode.val) {  //find position for newnode
            temp = temp.next;
        }
        newNode.next = temp.next; //insertion
        temp.next = newNode;    
    }
    
    public void print() {        // for displaying the linked list
        Node temp = head;
        if(temp == null) {
            System.out.println("List is empty");
            return;
        }
        while(temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void merge(labtask02j listTwo) {   //merge the other list
        Node temp = listTwo.head;
        while(temp != null) {
            sortInsertion(temp.val);
            temp = temp.next;
        }
    }

    
    public static void main(String[] args) {
        System.out.println("  LAB TASK 02 QUESTION NO. 4");
        labtask02j list1 = new labtask02j();
        labtask02j list2 = new labtask02j();
        
        list1.sortInsertion(11);
        list1.sortInsertion(5);
        list1.sortInsertion(16);

        list2.sortInsertion(2);
        list2.sortInsertion(7);
        list2.sortInsertion(12);
        
        System.out.println("List 1: ");
        list1.print();
        System.out.println("List 2: ");
        list2.print();
        
        list1.merge(list2);
        System.out.println("Merged sorted list: ");
        list1.print();
    }
}

