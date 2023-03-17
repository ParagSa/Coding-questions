import java.util.*;
class first{
	int a;
	int b;
}
class second extends first{
	int c;
	Demo d;
	second(){
		a = 0;
		b = 0;
		c = 0;
		d = new Demo();
	}
	void fun(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d.x);
		System.out.println(d.y);
	
	}
}
class Demo{
	int x;
	int y;
}
class exmp1{
	public static void main(String [] args){
		second s = new second();
		s.fun();
		
	}
}