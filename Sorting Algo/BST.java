import java.util.*;
class BST{
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left=right=null;
		}
	}
	BST(){
		root = null;
	}
	BST(int d){
		root = new Node(d);
	}
	Node printInsert(Node root,int key){
		if(root==null){
			root = new Node(key);
			return root;
		}
		if(root.data>=key){
			root.left = printInsert(root.left,key);
		}else{
			root.right = printInsert(root.right,key);
		}
		return root;
	}
	void insert(int key){
		root = printInsert(root,key);
	}
	Node printDelete(Node root, int key){
		if(root==null){
			return root;
		}
		if(key<root.data)
			root.left = printDelete(root.left,key);
		else if(key>root.data)
			root.right = printDelete(root.right,key);
		else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.data = minVal(root.right);
			root.right = printDelete(root.right,root.data);
		}
		return root;
		
	}
	int minVal(Node root){
		int x = root.data;
		while(root.left != null){
			x = root.left.data;
			root = root.left;
		}
		return x;
	}
	void delete(int key){
		root= printDelete(root,key);
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
		BST tp = new BST();
		tp.insert(15);
		tp.insert(7);
		tp.insert(21);
		tp.insert(5);
		tp.insert(35);
		tp.insert(2);
		tp.insert(62);
		tp.insert(19);
		System.out.println("Inorder");
		tp.inOrder();
		tp.delete(2);
	
		
		//System.out.println("Preorder");
		//tp.preOrder();
		System.out.println("Inorder");
		tp.inOrder();
		
		
	}
}
