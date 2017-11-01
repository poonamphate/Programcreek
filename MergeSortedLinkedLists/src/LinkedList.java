//reference link http://www.ideserve.co.in/learn/merge-two-sorted-linked-lists
public class LinkedList {
    Node head;
    
     
    // Add a new node to the front of the linked list
    public void addToFront(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
     
    // Print list elements
    public void printList() {
        Node tmp = head;
        //System.out.println("head = "+head.data);
        while(tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println();
    }
     
    // Merge 2 sorted lists to form a single sorted list
    public void mergeList(LinkedList list) {
    	
        if(list == null || list.head == null) {
            return;
        }
        
        if(head == null) {
            head = list.head;
            return;
        }
         
        Node tmp1 = head;
        Node tmp2 = list.head;
        if(tmp1.data < tmp2.data) {
            head = tmp1;
            tmp1 = tmp1.next;
        } else {
            head = tmp2;
            tmp2 = tmp2.next;
        }
        Node mergedNext = head;
 
        while(tmp1 != null && tmp2 != null) {
            if(tmp1.data < tmp2.data) {
                mergedNext.next = tmp1;
                tmp1 = tmp1.next;
                
            } else {
                mergedNext.next = tmp2;
                tmp2 = tmp2.next;
                
            }
            mergedNext = mergedNext.next;
            //System.out.println("mergeNext = "+mergedNext.data);
        }
        
        if(tmp1 != null) {
            mergedNext.next = tmp1;
          
        } else {
            mergedNext.next = tmp2;
            
        }
    }
     
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addToFront(9);
        list1.addToFront(8);
        list1.addToFront(6);
        list1.addToFront(5);
        list1.addToFront(4);
        list1.addToFront(2);
        list1.printList();
 
        LinkedList list2 = new LinkedList();
        list2.addToFront(7);
        list2.addToFront(3);
        list2.addToFront(1);
        list2.printList();
 
        list1.mergeList(list2);
        System.out.println("Merged List:");
        list1.printList();
    }
}
 
class Node {
    int data;
    Node next;  
 
    public Node(int data) {
        this.data = data;
    }
}
        








