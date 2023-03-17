class funcexception
{

	public static void myFun()
	{
		int arr[] = {5,10,15,20,25};
		try
		{
			System.out.println(arr[5]);	//It may cause ArrayIndexOutOfBoundsException
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException in inner catch caught");
		}
		finally
		{
			System.out.println("finally inner");
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		int a = 10;
		int b = 0;		//change value of b to 0
		int res = 0;
		
		try
		{		
			res = a/b;			//It may cause ArithmeticException
			myFun();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception caught here: ");
		}
		catch(Exception e)		//error: exception ArithmeticException has already been caught
		{
			System.out.println("Exception caught here: "+e.getMessage());
		}
		finally
		{
			System.out.println("finally outer");
		}
		
		System.out.println("result = " + res);
		System.out.println("Program executed successfully");
	}

}
/* Program started execution
Arithmetic exception caught here:
finally outer
result = 0
Program executed successfully*/
