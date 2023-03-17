import java.util.*;

interface i1{
	int num=5;
	void prinT();
	void prinT1();
}
interface i2 extends i1{
	int num2 = 10;
	
}
interface i3 extends i1,i2{
	
}
class MyInterface3 implements i3{
	
		//int num2= 4;
		public void prinT(){
			System.out.println("Hello Method prinT");
			System.out.println(num);
		}
		public void prinT1(){
			System.out.println("Hello method prinT1");
			System.out.println(num2);
		}
	    //System.out.println(num);
		//System.out.println(num2);
	
}
class MyInterface2{
	public static void main(String [] args){
		MyInterface3 m = new MyInterface3();
	    m.prinT();
	    //m.prinT1();
		
	}
	//MyInterface3 m = new MyInterface();
	//m.prinT();
	//m.prinT1();
}