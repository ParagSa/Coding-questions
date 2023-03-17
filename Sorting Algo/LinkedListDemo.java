import java.util.*;
class LinkedListDemo{
	private Node head;
	private Node tail;
	private int size;
	public LinkedListDemo(){
		this.size= 0;
	}
	private class Node{
		private int value;
		private Node next;
		
		
		
		public Node(int value){
			this.value = value;
		}
		public Node(int value,Node next){
			this.value = value;
			this.next = next;
		}
		
	}
	public void insertFirst(int val){
		Node node = new Node(val);
		node.next = head;
		head = node;
		if(tail==null){
			tail = head;
		}
		size ++;
	}
	public void insertLast(int val){
		
		if(tail==null){
			insertFirst(val);
			return;
		}else{
			Node node = new Node(val);
		    tail.next = node;
		    tail = node;
		    size++;
		}
		
	}
    public void insertAtIndex(int val1,int index){
		if(index==0){
			insertFirst(val1);
			return;
		}
		if(index==size){
			insertLast(val1);
			return;
		}
		Node temp = head;
		for( int i = 1;i<index;i++){
			
			temp = temp.next;
		}
		Node node = new Node(val1,temp.next);
		temp.next = node;
		size++;
		
		
		
	}
	public int  deleteFirst(){
		int val = head.value;
		head = head.next;
		if(head == null){
			tail =null;
		}
		size--;
		return val;
	}
	public Node get(int index){
		Node node = head;
		for(int i=1; i<index;i++){
			node = node.next;
			
		}
		return node;
	}
	public int deleteLast(){
		if(size<=1){
			return deleteFirst();
		}
		Node secondlast = get(size-2);
		int val = tail.value;
		tail = secondlast;
		tail.next=null;
		size--;
		return val;
	}
	public int deleteInplace(int index){
		if(index==0){
			return deleteFirst();
		}
		if(index== size-1){
			return deleteLast();
		}
		Node before = get(index-1);
		int val = before.next.value;
		before.next= before.next.next;
		
		size--;
		return val;
		
	}
	public Node find(int value){
		Node node = head;
		while(node!=null){
			if(node.value==value){
				return node;
			}
			node = node.next;
		}
		return null;
		
	}
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
}
class list{
	public static void main(String [] args){
		LinkedListDemo list = new LinkedListDemo();
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(1);
		list.insertFirst(17);
		list.insertLast(44);
		list.insertLast(2312);
		list.insertLast(2432678);
		/*list.insertAtIndex(11,3);
		list.deleteFirst();
		list.deleteLast();
		System.out.println(list.deleteInplace(1));*/
		list.display();
		
		
		
		
	}
}