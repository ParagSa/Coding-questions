import java.util.*;
class DoubleLL2{
	Node head;
	Node tail;
	int size;
	public DoubleLL2(){
		this.size = 0;
	}
	class Node{
		Node next,prev;
		int value;
		Node(int value){
			this.value = value;
		}
		Node(int value,Node next, Node prev){
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
	void insertFirst(int value){
		Node node = new Node(value);
		node.next = head;
		node.prev=null;
		head = node;
		if(tail==null){
			tail = head;
		}
		head = node;
		size++;
	}
	void insertLast(int value){
		if(tail==null){
			insertFirst(value);
			return;
		}else{
			Node node = new Node(value);
			tail.next = node;
			node.prev = tail;
			tail = node;
			node.next = null;
			size++;
		}
	}
	void deleteFirst(){
		Node temp = head;
		temp = temp.next;
		head = temp;
		head.prev=null;
		size--;
	}
	void replace(int old, int neww){
		Node node = new Node(neww);
	    Node temp = head;
		while(temp != null){
			if(temp.value == old){
			    System.out.println(temp.value);
				
				
				node.next = temp.next;
				node = temp.next.prev;
				temp.prev.next = node;
				
				//temp.next.prev = node;
				//node.next = temp.next;
				//node.prev = temp.prev;
				//temp.next.prev = node;
				node.prev = temp.prev;
			}
			temp = temp.next;
		}
	}
	void deleteLast(){
		if(head.next ==null){
			deleteFirst();
			return;
		}
		Node temp = tail.prev;
		tail = temp;
		tail.next =null;
		size--;
	}
	public void display(){
		Node temp = head;
		Node last = null;
		while(temp!=null){
			System.out.print(temp.value+" <=> ");
			last = temp;
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
		System.out.println("Print in Reverse");
		while(last!=null){
			System.out.print(last.value+" <=> ");
			last = last.prev;
		}
		System.out.print("null");
		
	}
}
class Double2{
	public static void main(String [] args){
		DoubleLL2 list = new DoubleLL2();
		list.insertFirst(2);
		list.insertFirst(12);
		list.insertFirst(16);
		list.insertFirst(31);
		list.insertFirst(46);
		list.insertFirst(50);
		list.insertFirst(67);
	    list.insertLast(89);
	    list.insertLast(100);
		list.deleteFirst();
		list.deleteLast();
		list.replace(31,30);
		list.display();
	}	
}