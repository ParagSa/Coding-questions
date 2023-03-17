import java.io.*;
class ThrowsDemo{
	public static void myFun() throws ArithmeticException,IOException
	{
		int a= 10;
		int b = 0;
		int c = a/b;
		 //System.out.println("myFuc called");
	}
	public static void main(String [] args){
		System.out.println("Program started execution");
		try{
			myFun();
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException caught"+e.getMessage());
		}
		catch(IOException e){
			System.out.println("IOException caught"+e.getMessage());
		}
		finally
		{
			System.out.println("finally block executed");
		}
		
	}
	
}