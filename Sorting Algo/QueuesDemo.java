import java.util.*;
class QueuesDemo{
	int front;
	int rear;
	int Q[];
	QueuesDemo(int size){
		Q = new int[size];
		rear = -1;
		front = -1;
		
	}
	boolean isEmpty(){
      if(front == -1){
		  return true;
	    }else{
			return false;
		}
	}
	boolean isFull(){
		if(front==0 && rear == Q.length-1){
			return true;
		}else{
			return false;
		}
	}
	void enqueue(int n){
		if(isFull()){
		    System.out.println("Queue is full");
		}else{
			if(front==-1){
			  front = 0;
		    }
		    
			rear++;
			Q[rear]= n;
			System.out.println(n+" Inserted.");
		    
		}
		
	}
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}else{
			int x = Q[front];
			if(front>=rear){
				front =-1;
				rear = -1;
			}else{
				front++;
			}
			System.out.println(x+" Deleted.");
			return x;
			
		}
	}
	void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			for(int i = front;i<=rear;i++){
				System.out.println(Q[i]);
			}
		}
		
	}
	public static void main(String args[])
	{
		QueuesDemo q1 = new QueuesDemo(5);
		q1.enqueue(12);
		q1.enqueue(16);
		q1.enqueue(35);
		q1.enqueue(40);
		q1.enqueue(45);
		//q1.enqueue(80);
		q1.dequeue();
		q1.display();
	}
}