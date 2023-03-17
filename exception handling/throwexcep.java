class throwexcep
{
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		
		try
		{		
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception caught here");
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("Program terminated successfully");
		
	}
}


/*OUTPUT:
Program started execution
Arithmetic exception caught here
finally block
Program terminated successfully*/