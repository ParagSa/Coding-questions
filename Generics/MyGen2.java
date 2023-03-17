import java.util.*;
class Demo<T1,T2>{
	T1 a;
	T2 b;
	double d;
	Demo(){
		
	}
	Demo(T1 a, T2 b, double d){
		this.a = a;
		this.b = b;
		this.d = d;
		
		
	}
	
}
class MyGen2{
	public static void main(String args[])
	{
		Demo<Integer,Double> d1 = new Demo<Integer,Double>(10,23.4,45.3);
	}
}