class throwexcep3
{
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		int a = -1;
		try
		{
			try
			{	
				if(a < 0)
				{	
					ArithmeticException ae = new ArithmeticException("value can not be negative");
					throw ae;
				}
				System.out.println("Out of if block");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception caught here : "+e.getMessage());
				throw e;		//rethrowing an exception
			}
			catch(Exception e)
			{
			}
			finally
			{
				System.out.println("finally block");
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception : " +e.getMessage());
		}
		
		System.out.println("Program terminated successfully");
		
	}
}
/*
Program started execution
Arithmetic exception caught here : value can not be negative
finally block
Exception : value can not be negative
Program terminated successfully
*/
