import java.util.*;
class StackDemo{
	static final int max = 5;
	int top;
	int S[] = new S[max];
	StackDemo(){
		top = -1;
	}
	boolean isEmpty(){
		return (top<1);
	}
	boolean isFull(){
		return (top == max-1);
	}
	void push(int value){
		if(top>= Max-1){
			System.out.println("Stack Overflow!!");
			return false;
		}else{
			s[++top] = x;
			System.out.println("Pushed "+x);
			return true;
		}
	}
	
}