import java.util.*;
class Circular{
	private Node head;
	private Node tail;
	int size;
	
	public Circular(){
		this.size= 0;
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value){
			this.value= value;
		}
		public Node(int value, Node next){
			this.value= value;
			this.next = next;
		}
		
	}
	public void insertFirst(int value){
		Node node = new Node(value);
		
		if(head==null){
			head = node;
			tail= node;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	public void delete(int value){
		Node temp = head;
		while(temp.next.value != value ){
			temp = temp.next;
		}
		System.out.println(temp.value);
		System.out.println(temp.next.next.value);
		temp.next = temp.next.next;
		
		
	}
	
	public void display(){
		Node temp = head;
		while(temp.next != head){
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.print(temp.value+" -> head");
	}
	
}
class list{
	public static void main(String [] args){
		Circular list1 = new Circular();
		list1.insertFirst(12);
		list1.insertFirst(22);
		list1.insertFirst(36);
		list1.insertFirst(45);
		list1.insertFirst(65);
		list1.insertFirst(89);
		list1.insertFirst(97);
		list1.delete(12);
		list1.display();
		
	}
}