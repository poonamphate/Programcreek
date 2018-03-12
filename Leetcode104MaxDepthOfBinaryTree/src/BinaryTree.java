/*Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the
longest path from the root node down to the farthest leaf node.
Solution: https://www.programcreek.com/2014/05/leetcode-maximum-depth-of-binary-tree-java/*/
public class BinaryTree {
	public static class Node{
		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}//end of Node class
	
	public static void main(String[] args){
		BinaryTree bi = new BinaryTree();
		Node root = createNode();
		int depth = bi.maxDepth(root);
		System.out.println("depth = "+depth);
	}
	
	public static Node createNode(){
		Node rootNode = new Node(40);
		Node node20 = new Node(20);
		Node node60 = new Node(60);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node50 = new Node(50);
		Node node70 = new Node(70);
		
		rootNode.left = node20;
		rootNode.right = node60;
		node20.left = node10;
		node20.right = node30;
		node60.left = node50;
		node60.right = node70;
				
		return rootNode;
	}
	
	public int maxDepth(Node root){
	    if(root==null)
	    	return 0;
		//System.out.println("root.left = "+(""+root.left));
	    int leftDepth = maxDepth(root.left);
	    System.out.println("leftDepth = "+leftDepth);
	    
	    //System.out.println("right.left = "+root.right);
	    int rightDepth = maxDepth(root.right);
	    System.out.println("rightDepth = "+rightDepth);
	 
	    int bigger = Math.max(leftDepth, rightDepth);
	   // int result = bigger+1;
	    //System.out.println("Bigger = "+result);

	    return bigger+1;
	}
}
