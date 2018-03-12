
import java.util.HashSet;
/**
 * https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve
 * Linked List Intersection
 * Two linked lists list1 and list2 are joined a particular node, called the point of intersection of the linked lists. 
 * Find the point of intersection, i.e. the first node after which both lists have same nodes.
 * Example:
 * List1: 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - X
 * List2: 11 - 12 - 13 - 14 - 15 - 5 - 6 - 7 - 8 - 9 - 10 - X
 * Output: 5
 */
public class IntersectionOfTwoLinkedList {

	Node head;

	// Solution 1: Time Complexity: O(n*m); Space Complexity: O(1)
	public static Node getIntersectionOfLists(Node list1head, Node list2head) {

		Node temp1 = list1head;
		while(temp1 != null) {  
			Node temp2 = list2head;
			while(temp2 != null) {

				if(temp1 == temp2) {
					return temp1;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}

		return null;
	}

	// Solution 2: Time Complexity: O(n+m); Space Complexity: O(n)
	public static Node getIntersectionOfListsUsingHash(Node node1, Node node2) {

		if(node1 == null || node2 == null) {
			return null;
		}

		HashSet<Node> set = new HashSet<Node>();
		
		while(node1 != null) {
			set.add(node1);
			node1 = node1.next;
		}
		
		while(node2 != null) {
			if(set.contains(node2)) {
				return node2;
			}
			node2 = node2.next;
		}
		return null;
	}

	public void addToList(int data) {

		if(head == null) {
			head = new Node(data);
			return;
		}

		Node tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new Node(data);
	}

	public static void main(String[] args) {
		IntersectionOfTwoLinkedList list1 = new IntersectionOfTwoLinkedList();
		int i = 1;
		int n = 5;
		while(i <= n) {
			list1.addToList(i);
			i++;
		}

		IntersectionOfTwoLinkedList list2 = new IntersectionOfTwoLinkedList();
		i = 11;
		n = 15;
		while(i <= n) {
			list2.addToList(i);
			i++;
		}

		Node tmp1 = list1.head;
		i = 1;
		n = 5;
		while(i < n) {
			tmp1 = tmp1.next;
			i++;
			//System.out.println("tmp1.data = "+tmp1.data);
		}

		Node tmp2 = list2.head;
		while(tmp2.next != null) {
			tmp2 = tmp2.next;
			//System.out.println("tmp2.data = "+tmp2.data);
		}
		tmp2.next = tmp1;

		Node intersection = getIntersectionOfListsUsingHash(list1.head, list2.head);
		if(intersection != null) {
			System.out.println("Intersection of linked lists found at Node " + intersection.data);
		} else {
			System.out.println("Linked lists do not intersect!");
		}
	}

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;       
		}
	}

}
