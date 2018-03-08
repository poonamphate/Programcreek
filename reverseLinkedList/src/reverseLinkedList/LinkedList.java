//Explaination https://www.youtube.com/watch?v=TSDl7sRxWdU
package reverseLinkedList;

public class LinkedList {
	 
    static Node head;
 
    static class Node {
 
        private int data;
        private Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        //LinkedList list = new LinkedList();
        head = new Node(4);
        Node second = new Node(3);
        Node third = new Node(2);
        Node fourth = new Node(1);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
         
        System.out.println("Given Linked list is");
        printList(head);
        head = reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        printList(head);
    }
}
 