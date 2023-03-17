import java.util.*;

class First
{
	public int a;
	private int b;
	
	void myFun()
	{
			
	}
}

class AccessSpecifierDemo
{
	public static void main(String args[])
	{
		First f = new First();
		System.out.println(f.a);		//OK
		System.out.println(f.b);		//Complation Error
	}
}