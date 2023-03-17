import java.util.*;
class MathOperation{
	private int n1;
	private int n2;
	MathOperation(){
		
	}
	MathOperation(int n1,int n2){
		this.n1= n1;
		this.n2 = n2;
		System.out.println("hello");
	}
	int add(){
		
		return n1+n2;
	}
	int sub(){
		
		return n1-n2;
	}
	int mul(){
	
		return n1*n2;
	}
	double div(){
		
		return n1/n2;
	}
	double power(){
		
		return Math.pow(n1,n2);
	}
	
	
}
class Demo{
	public static void main(String[]args){
		MathOperation obj = new MathOperation(2,2);
	//int multi = obj.add();
	//System.out.println(obj.add());
	System.out.println(obj.add());
	System.out.println(obj.sub());
	System.out.println(obj.mul());
	System.out.println(obj.div());
	System.out.println(obj.power());
	}
	
}
