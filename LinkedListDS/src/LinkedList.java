//LinkedList basics - append, prepend, delete, print node
//reference : https://www.youtube.com/watch?v=njTh_OwMljA
public class LinkedList {
	static Node head;
	
	public void append(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		
		current.next = new Node(data);
	}
	
	public void prepend(int data){
		Node temp = head;
		head = new Node(data);
		head.next = temp;
	}
	
	public void deleteNode(int data){
		if(head == null){
			return;
		}
		if(head.data == data){
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next!= null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void printList(){
		if(head == null){
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.append(5);
		list.printList();
		list.prepend(4);
		list.printList();
		list.prepend(4);
		list.printList();
		list.deleteNode(4);
		list.printList();
	}
}

class Node{
	Node next;
	int data;
	
	public Node(int data){
		this.data = data;
	}
}