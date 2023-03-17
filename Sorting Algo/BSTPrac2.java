import java.util.*;
class BSTPrac2{
	static  Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			front = rear = null;
		}
	}
	BSTPrac2(){
		root = null;
	}
	BSTPrac2(int data){
		root = new Node(data);
		
	}
	Node printInsert(Node root,int key){
		if(root == null){
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
	void insert(){
		root = printInsert(root,key);
	}
	Node printDelete(Node root, int key){
		if(root==null){
			return root;
		}
		if(root.data<key){
			root.right = printDelete(root.right,key);
		}else if(root.data>key){
			root.left = printDelete(root.left,key);
		}else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.data = minVal(root.right);
			root.right = printDelete(root.right,root.data);
		}
	}
	

		
	
}