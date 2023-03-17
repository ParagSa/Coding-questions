class throwexcep2
{
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		int a = 5;
		try
		{	
			if(a < 0)
			{	
				ArithmeticException ae = new ArithmeticException();
				throw ae;
			}
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
finally block
Program terminated successfully