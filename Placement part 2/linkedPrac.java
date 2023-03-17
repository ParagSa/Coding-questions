
import java.util.*;
class LinkedDemo{
	private Node head;
	private Node tail;
	private int size;
	public LinkedDemo(){
		this.size = 0;
	}
    class Node{
		 int value;
		 Node next;
		public Node(int value){
			this.value= value;
		}
		public Node(int Value, Node next){
			this.value=value;
			this.next = next;
		}
	}
	public void insertFirst(int val){
		Node node = new Node(val);
		node.next= head;
		head = node;
		if(tail==null){
			tail=head;
		}
		size++;
		
	}
	public void insertLast(int val){
		//Node node = new Node(val);
		if(tail==null){
			insertFirst(val);
			return;
		}else{
			Node node = new Node(val);
			tail.next= node;
			node = tail;
			size++;
		}
		
		
	    
	}
	public Node get(int index){
		Node temp = head;
		for(int i = 1;i<index;i++){
			temp = temp.next;
		}
		return temp;
		
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
	public int deleteFirst(){
		int val = head.value;
		head = head.next;
		if(head==null){
			tail =null;
		}
		size--;
		return val;
		
	}
	static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
	public int deleteLast(){
		int val = tail.value;
		if(size<=1){
			deleteFirst();
			return val;
		}
		Node beforelast = get(size-2);
		tail=beforelast;
		tail.next = null;
		size--;
		return val;	 
	}
	public int deleteInplace(int index){
		
		if(index==0){
			return deleteFirst();
		}
		if(index == size-1){
			return deleteLast();
			
		}
		Node beforeIndex = get(size-1);
		int val = beforeIndex.next.value;
		beforeIndex.next=beforeIndex.next.next ;
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
	
	
	public static void main(String [] args){
		LinkedDemo list = new LinkedDemo();
		list.insertFirst(12);
		list.insertFirst(15);
		list.insertFirst(28);
		list.insertFirst(34);
		list.insertFirst(49);
		list.insertFirst(69);
		list.insertFirst(78);
		//list.insertLast(100);
		//list.insertLast(123334);
		//list.insertLast(1234324535);
		//list.insertAtIndex(72,3);
	    /*System.out.println(list.deleteFirst());
		System.out.println(list.deleteLast());
		System.out.println(list.deleteLast());
		System.out.println(list.deleteInplace(0));*/
		//Node head = new Node(reverseLL());
		 
		
		list.display();
		//Node head = new Node();
		//head = reverseLL();
		/// System.out.println();
		list.reverseLL();
		
		
	}
}