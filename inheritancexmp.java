import java.util.*;

class First{
	private int a;
	First(){
		System.out.println("class first 0=arg con");
	}
	First(int a){
		
		System.out.println("class first 1=arg con");
		
		
	}
	void setA(int a){
		this.a= a;
		
	}
	int getA(){
		return a;
	}
}

class Second extends First{
	
	int b;
	Second(){
		System.out.println("class second 0=arg con");
	}
	Second(int a, int b){
		super(a);
		System.out.println("class second 2=arg con");
		//super(a);
		this.b = b;
	}
}

class Third extends Second{
	int c;
	Third (){
		System.out.println("class third 0=arg con");
		
	}
	Third(int a, int b,int c){
		setA(a);
		this.b= b;
		this.c= c;
	}
	public void fun(){
		System.out.println(getA());
		System.out.println(b);
		System.out.println(c);
	}
	
	
}
class inheritancexmp{
	public static void main(String [] args){
		Third obj = new Third(12,13,14);
		obj.fun();
	}
}