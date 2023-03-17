import java.util.*;
class MyException extends Exception{
	public MyException(){
		super("Default exception message");
	}
	public MyException(String str){
		super("sane "+str);
	}
	
}
class MyExceptionDemo{
	public static void main(String []args){
		System.out.println("Program started execution");
		try
		{
			//throw new MyException();
			throw new MyException("hello parag");
		}
		catch(MyException e){
			System.out.println("inside catch "+e.getMessage());
			
		}
		System.out.println("Program terminated");
		
		
	}
}