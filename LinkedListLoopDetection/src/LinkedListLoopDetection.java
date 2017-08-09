/*Given a linked list, check if the the linked list has loop or not.*/

public class LinkedListLoopDetection {
	static Node head;
	
	static class Node{
		int data; 
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		
	//method to print LinkedList
	public void printList(Node node){
		while(node != null){
			System.out.println(node.data+" ");
			node = node.next;
		}
	 }
	
	//method to detect loop
	public boolean detectLoop(Node node){
		
			Node fast = node;
			Node slow = node;
			
			while(fast != null && fast.next != null){
				fast = fast.next.next;
				slow = slow.next;
				
				if(fast == slow){
					return true;
				}
			}
		return false;
	}
		
	//main method
	public static void main(String[] args){
		LinkedListLoopDetection list = new LinkedListLoopDetection();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		head.next = second;
		second.next = third;
		third.next = second;
		
		//list.printList(head);
		boolean result = list.detectLoop(head);
		System.out.println(result);
				
		}
	}

	
		
	

