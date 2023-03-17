import java.util.*;
class QPrac{
	int front;
	int rear;
	int []Q;
	QPrac(int size){
		Q = new Q[size];
		front = -1;
		rear = -1;
	}
	boolean isEmpty(){
		return (front == -1);
	}
	boolean isFull(){
		return (front == 0 && rear == Q.length-1)
	}
	void enqueue(int num){
		if(front == -1){
			front =0;
		}
		rear++;
		Q[rear] = num;
		System.out.println("added "+ num)
		
	}
	void dequeue(){
		int m = Q[front];
		front++;
		System.out.println("deleted "+ m)
		
	}
}