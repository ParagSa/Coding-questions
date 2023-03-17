import java.util.*;
class DoubleLL{
	Node head;
	Node last;
	int size;
	DoubleLL(){
		this.size =0;
	}
	
	public void insertFirst(int val){
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head!=null){
			head.prev = node;
		}
		head = node;
		size++;
		
	}
	public void insertLast(int val){
		Node node = new Node(val);
		Node last = head;
		
		if(head == null){
			node.prev = null;
			head = node;
			return;
		}
		
		while(last.next != null){
			last = last.next;
		}
		last.next = node;
		node.prev = last;
		node.next=null;
		size++;
		
	}
	public void insertAtIndex(int val,int index){
		if(index==0){
			insertFirst(val);
			return;
		}
		if(index==size-1){
			insertLast(val);
			return;
		}
		Node temp = head;
		for( int i = 1;i<index;i++){
			
			temp = temp.next;
		}
		Node node = new Node(val,temp.next,temp.prev);
		node.next = temp.next;
		temp.next = node;
		node.prev = temp;
		node.next.prev = node; 
		
		size++;
		
		
		
	}
	public int deleteFirst(){
		int val = head.val;
		head = head.next;
		head.prev = null;
		if(head==null){
			last=null;
		}
		size--;
		return val;
	}
	public int deleteLast(){
		if(size<=1){
			return deleteFirst();
		}
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		int val = last.val;
		Node secondLast = get(size-1);
		last = secondLast;
		last.next= null;
		size--;
		return val;
		
	}
	public int deleteInplace(int index){
		if(index ==0){
			return deleteFirst();
		}
		if(index == size-1){
			return deleteLast();
		}
		Node before = get(index);
		int val = before.next.val;
		before.next = before.next.next;
		before.next.prev = before;
		size--;
		return val;
		
		
	}
	public Node get(int index){
		Node temp = head;
		for(int i = 1;i<index;i++){
			temp = temp.next; 
		}
		return temp;
	}
	public void display(){
		Node temp = head;
		Node last = null;
		while(temp!=null){
			System.out.print(temp.val+" <=> ");
			last = temp;
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
		System.out.println("Print in Reverse");
		while(last!=null){
			System.out.print(last.val+" <=> ");
			last = last.prev;
		}
		System.out.print("null");
		
	}
	private class Node{
		int val;
		Node next;
		Node prev;
		public Node(int val){
			this.val = val;
		}
		public Node(int val, Node next,Node prev){
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}
}
class Doublelist{
	public static void main(String [] args){
		DoubleLL list = new DoubleLL();
		list.insertFirst(2);
		list.insertFirst(12);
		list.insertFirst(16);
		list.insertFirst(31);
		list.insertFirst(46);
		list.insertFirst(50);
		list.insertFirst(67);
	    list.insertLast(89);
		list.insertAtIndex(1000,3);
		System.out.println(list.deleteFirst());
		System.out.println(list.deleteLast());
		System.out.println(list.deleteInplace(3));
		System.out.println(list.deleteInplace(2));
		System.out.println(list.deleteInplace(4));
		
		list.display();
		
	}
}	