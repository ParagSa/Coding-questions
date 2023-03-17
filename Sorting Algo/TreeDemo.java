import java.util.*;
class TreeDemo{
	static Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data = d;
			left = right = null;
		}
		
	}
	TreeDemo(){
		root= null;
	}
	TreeDemo(int d){
		root = new Node(d);
	}
	void printPreorder(Node n){
		if(n==null)
			return;
		
		System.out.println(n.data);
		printPreorder(n.left);
		printPreorder(n.right);
	}
	void preOrder(){
		printPreorder(root);
	}
	void printIneorder(Node n){
		if(n==null)
			return;
		
		printIneorder(n.left);
		System.out.println(n.data);
		printIneorder(n.right);
	}
	void inOrder(){
		printIneorder(root);
	}
	void printPostorder(Node n){
		if(n==null)
			return;
		
		printPostorder(n.left);
		printPostorder(n.right);
		System.out.println(n.data);
	}
	void postOrder(){
		printPostorder(root);
	}
	public static void main(String [] args){
		TreeDemo td = new TreeDemo();
		root = new Node(10);
		root.left = new Node(8);
		root.right= new Node(12);
		root.left.left= new Node(5);
		root.left.right = new Node(9);
		System.out.println("PreOrder");
		td.preOrder();
		System.out.println("InOrder");
		td.inOrder();
		System.out.println("PostOrder");
		td.postOrder();
	}
}