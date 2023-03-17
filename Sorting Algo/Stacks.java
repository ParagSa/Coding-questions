import java.util.*;
class Stacks{
	static final int Max = 5;
	int top;
	int s[] = new int[Max];
	Stacks(){
		top = -1;
	}
	boolean isEmpty(){
		return (top<0);
	}
	boolean push(int x){
		if(top>= Max-1){
			System.out.println("Stack Overflow!!");
			return false;
		}else{
			s[++top] = x;
			System.out.println("Pushed "+x);
			return true;
		}
	}
	void pop(){
		if(top<= 0){
			System.out.println("Stack Underflow!!");
		}else{
			int m = s[top--];
			System.out.println("pooped "+m);
			
			//System.out.println("pooped "+m);
			
		}
	}
	boolean isFull(){
		return (top ==(Max-1));
	}
    void peek(){
		if(top<0){
			System.out.println("Stack Underflow!!");
		}
		else{
			System.out.println(s[top]);
		}
		
	}
	public static void main(String []args ){
		Stacks st = new Stacks();
		//st.push(12);
		//st.push(45);
		//st.push(56);
		//st.push(67);
		//st.push(89);
		//st.pop();
		//System.out.println(st.isFull());
		//st.push(99);
		st.peek();
	}
	
}