import java.util.*;
class TreePrac{
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left=right=null;
		}
	}
	TreePrac(){
		root = null;
	}
	TreePrac(int d){
		root = new Node(d);
	}
	void printPreOrder(Node n){
		if(n==null)
			return;
		
		System.out.println(n.data);
		printPreOrder(n.left);
		printPreOrder(n.right);
	}
	void preOrder(){
		printPreOrder(root);
	}
	void printInOrder(Node n){
		if(n==null)
			return;
		
		
		printPreOrder(n.left);
		System.out.println(n.data);
		printPreOrder(n.right);
	}
	void inOrder(){
	   printInOrder(root);
	}
	void printPostOrder(Node n){
		if(n==null)
			return;
		
		
		printPreOrder(n.left);
		printPreOrder(n.right);
		System.out.println(n.data);
	}
	void postOrder(){
		printPostOrder(root);
	}
	public static void main(String [] args){
		TreePrac tp = new TreePrac();
		root = new Node(10);
		root.left = new Node(8);
		root.right= new Node(12);
		root.left.left = new Node(5);
		root.left.right = new Node(9);
		System.out.println("Preorder");
		tp.preOrder();
		
		
	}
}
