class First
{
	static void myFun()
	{
		System.out.println("myFun of First");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of First");
	}
	
	//code
}

class Second extends First
{
	static void myFun()	//Method hiding
	{
		System.out.println("myFun of Second");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of Second");
	}
	
	//code
}

class exmp4
{
	public static void main(String args[])
	{
		First f = new Second();
		f.myFun();
		f.anotherFun();
	}
}