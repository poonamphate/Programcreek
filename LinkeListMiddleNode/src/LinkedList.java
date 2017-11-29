

public class LinkedList{

	static Node head;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;

		}
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}


	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value+"-->");
			temp = temp.next;
		}
		System.out.println();
	}

	// This function will find middle element in linkedlist
	public Node findMiddleNode(Node head)
	{
		Node slowPointer, fastPointer; 
		slowPointer = fastPointer = head; 

		while(fastPointer !=null) { 
			fastPointer = fastPointer.next; 
			if(fastPointer != null && fastPointer.next != null) { 
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next; 
			} 
		} 

		return slowPointer; 

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list
		head=new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;


		list.printList(head);
		// finding middle element
		Node middle= list.findMiddleNode(head);
		System.out.println("Middle node will be: "+ middle.value);

	}

}
