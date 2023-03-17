import java.util.*;
class LLPrac{
	Node head;
	Node tail;
	int size;
	
	public class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
		Node(int d, Node next){
			data = d;
			this.next = next;
		}
	}
	public LLPrac(){
		this.size = 0;
	}
	public void insertFirst(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
		if(tail==null){
			tail = head;
		}
		size++;
	}
	public void insertLast(int data){
		if(tail==null){
			insertFirst(data);
			return;
		}else{
			Node node = new Node (data);
		    tail.next = node;
		    tail = node;
		    size++;
			
		}	
		
	}
	public void deleteFirst(){
		if(head==null){
			return;
		}else{
			head = head.next;
			size--;
		}	
		
		
	}
	public void deleteLast(){
		Node temp = head;
		while (temp.next.next!= null){
			temp = temp.next;
		}
		System.out.println(temp.data);
		tail = temp;
		tail.next = null;
		size--;
		
	} 
	public void insertInplace(int index,int data){
		if(index==0){
			insertFirst(data);
			return;
		}
		if(index==size){
			insertLast(data);
			return;
		}
		Node temp = head;
		for( int i = 1;i<index;i++){
			
			temp = temp.next;
		}
		Node node = new Node(data,temp.next);
		temp.next = node;
		size++;
		
	}
	public void deleteInplace(int index){
		if(index == 0){
			deleteFirst();
			return;
		}
		if(index == size-1){
			deleteLast();
			return;
		}
		Node temp = head;
		for(int i = 0; i <index-1;i++){
			temp = temp.next;
		}
		System.out.println(temp.next.data);
		temp.next = temp.next.next;
		size--;
		
		
	}
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" -> ");
			temp = temp.next;
			
		}
		System.out.print("null");
		
	}
}
class Linked{
	public static void main(String [] args){
		LLPrac l1 = new LLPrac();
		l1.insertFirst(10);
		l1.insertFirst(21);
		l1.insertFirst(48);
		l1.insertFirst(54);
		l1.insertFirst(89);
		l1.insertFirst(144);
		l1.insertLast(1338);
		l1.insertLast(133122);
		l1.insertLast(134556654);
		l1.insertInplace(4,-24);
		l1.deleteFirst();
		l1.deleteLast();
		l1.deleteInplace(3);
		
		l1.display();
	}
}