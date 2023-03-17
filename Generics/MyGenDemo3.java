import java.util.*;

class Demo<T>
{
	void fun1(Demo<T> d)	//Type of object i.e the object whose reference is getting stored in d, should 					//be same as calling object type
	{
		System.out.println(d);
	}
	
	void fun2(Demo<?> d)	//Type of object can be any valid type of Demo.
	{
		System.out.println(d);
	}
	
	void fun3(Demo<? extends Number> d)	//Type of object can be any valid type of Demo whose Type 						//parameter is either Number or child class of Number.
	{
		System.out.println(d);
	}
}

class MyGenDemo3
{
	public static void main(String args[])
	{
		//Demo<Integer>
		Demo<Integer> d1 = new Demo<Integer>();
		Demo<Double> d2 = new Demo<Double>();
		Demo<String> d3 = new Demo<String>();
		Demo<Integer> d4 = new Demo<Integer>();
		
		//d1.fun1(d2);		//Error, calling object d1's type Demo<Integer> whereas d2's type is 						//Demo<Double>
		d1.fun1(d4);		//OK
		
		d1.fun2(d2);		//OK
		d1.fun2(d3);		//OK
		
		//d1.fun3(d3);		//Error
		d1.fun3(d2);		//OK		
		
		
	}
}