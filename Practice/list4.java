import java.util.*;
class linkedlist1{
	private Node head;
	private Node tail;
	private int size;
	public linkedlist1(){
		this.size=0;
	}
	private class Node{
		private int value;
		private Node next;
		public Node(int value){
			this.value = value;
		}
		public Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}
	public void insertfirst(int value){
		Node node = new Node(value);
		node.next = head;
		head = node;   
		if(tail== null){
			tail = head;
		}
		size++;
	}
	public void insertlast(int value){
		if(tail==null){
			insertfirst(value);
		}else{
			Node node = new Node(value);
			tail.next = node;
			tail = node;
		}
		size++;
	}
	public void insertAtIndex(int value, int index){
		if(index==0){
			insertfirst(value);
			return;
		}
		if(index==size){
			insertlast(value);
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		Node node = new Node(value,temp.next);
		temp.next = node;
		size++;
	}
	public int deletefirst(){
		int value = head.value;
		head = head.next;
		if(head== null){
			tail=null;
		}
		size--;
		return value;
	}
	public int deletelast(){
		if(size<=1){
			return deletefirst();
		}
		Node temp = head;
		while(temp.next.next!= null){
			temp= temp.next;
		}
		int val = tail.value;
		tail = temp;
		tail.next = null;
		size--;
		return val;
	}
	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
}
class list4{
	public static void main(String [] args){
	    linkedlist1 list = new linkedlist1();
		list.insertfirst(12);
		list.insertfirst(2);
		list.insertfirst(1);
		list.insertfirst(17);
		list.insertlast(44);
		list.insertlast(2312);
		list.insertlast(2432678);
		/*list.insertAtIndex(11,3);
		list.deleteFirst();
		list.deleteLast();
		System.out.println(list.deleteInplace(1));*/
		list.display();
		
		
		
		
	}
}