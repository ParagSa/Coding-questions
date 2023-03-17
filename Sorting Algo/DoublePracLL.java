import java.util.*;
class DoublePracLL{
	private Node head;
	private Node last;
	int size;
	public DoublePracLL(){
		this.size=0;
	}
	private class Node {
		int value;
		Node next;
		Node prev;
		public Node( int value){
			this.value = value;
			
		}
		public Node(int value, Node next,Node prev){
			this.value= value;
			this.next = next;
			this.prev = prev;
		}
	}
	public void insertFirst(int value){
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if(head!=null){
			head.prev=node;
		}
		head = node;
		size++;	
	}
	public void insertInplace(int value,int index){
		if(index<=1){
			insertFirst(value);
			return;
		}
		if(index==size){
			insertLast(value);
			return;
		}
		
		Node temp = head;
		/*for(int i=1;i<=index;i++){
			temp = temp.next;
		}
		Node node = new Node(value,temp.next, temp.prev);
		System.out.println(temp.value);
		temp.prev= node;
		node.prev = temp.prev.prev;
		temp.prev.next = node;
		node.next = temp;
		
		size++;*/
		for(int i=1;i<=index-1;i++){
			temp = temp.next;
		}
		Node node = new Node(value,temp.next, temp.prev);
		System.out.println(temp.value);
		temp.next= node;
		node.next = temp.next.next;
		temp.next.prev = node;
		node.prev = temp;
		
		size++;
		
	}
	public void insertLast(int value){
		Node node = new Node(value);
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next= node;
		node.prev = last;
		node.next=null;
		last = node;
		size++;
		
		
	}
	public void deleteFirst(){
		int val = head.value;
		head = head.next;
		head.prev=null;
		if(head==null){
			last=null;
		}
		size--;
		
	}
	public void deleteLast(){
		Node last = head;
		while(last.next!=null){
			last=last.next;
		}
		
		int val = last.value;
		System.out.println(val);
		last.prev.next=null;
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
class list{
	public static void main(String[]args){
		DoublePracLL list1 = new DoublePracLL();
		list1.insertFirst(12);
		list1.insertFirst(19);
		list1.insertFirst(35);
		list1.insertFirst(64);
		list1.insertFirst(98);
		list1.insertFirst(117);
		list1.insertFirst(144);
		list1.insertLast(10000);
		list1.insertInplace(11101,3);
		//list1.deleteFirst();
		//list1.deleteLast();
		list1.display();
	}
}