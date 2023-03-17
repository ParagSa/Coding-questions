import java.util.*;
class LinkedListD{
	
	private Node head;
	private Node tail;
	private int size;
	public LinkedListD(){
		this.size=0;
	}
	public class Node{
		int value;
		Node next;
		public Node(int value){
			this.value = value;
		}
		public Node(int value, Node next){
			this.value = value;
			this.next = next;
			
		}
	}
	public void insertFirst(int value){
		Node node = new Node(value);
		node.next = head;
		head = node;
		if(tail==null){
			tail = head;
			
		}
		size++;
		
	}
	public void insertLast(int value){
		
		if(tail== null){
			insertFirst(value);
			return;
		}else{
			Node node = new Node(value);
			tail.next = node;
			node = tail;
			size++;
		}
		
	}
	public void insertInPlace(int value, int index){
		if(index==0){
		    insertFirst(value);
			return;
		}
		if(index==size){
			insertLast(value);
			return;
		}
		Node node = new Node(value);
		Node temp = head;
		for(int i = 0; i<index-1;i++)
		{
			temp = temp.next;
			
		}
		node.next = temp.next;
		temp.next = node;
		
		size++;
		
	}
	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.value+"-->");
			temp = temp.next;
			
		}
		 System.out.print("null");
	}
	
	public static void main(String []args){
		LinkedListD list = new LinkedListD();
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertLast(5);
	//	list.insertInPlace(7,2);
		list.insertInPlace(10,1);
		list.insertFirst(12);
		list.insertFirst(13);
		list.insertFirst(14);
		list.insertFirst(15);
		list.insertInPlace(1000,2);
		list.display();
		
		
	}
} 