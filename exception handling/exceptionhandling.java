import java.util.*;
class exceptionhandling{
	public static void main(String [] args){
		int a = 10;
		int b = 0;
		int res = 0;
		System.out.println("calculate result");
		int arr[]={5,12,15,58,32,112,55,18};
		try{
			System.out.println(arr[10]);
			res = a/b; // arithmatic excetion ka object banke catch ko throw karega
		   	//System.out.println(arr[10]);
		}
		/*catch( ArrayIndexOutOfBoundsException e){
			System.out.println("Array index error caught");
			System.out.println(e.getMessage());
		}*/
		catch(Exception e){            //universal handler(parent class)
			//System.out.println("ArithmeticException caught");
			System.out.println(e.getMessage());
			//System.out.println("Array index error caught");
			//System.out.println(A.getMessage());
			
			
			
		}
		
		/*catch(ArithmeticException e){
			System.out.println("ArithmeticException caught");
			System.out.println(e.getMessage());
			//System.out.println("Array index error caught");
			//System.out.println(A.getMessage());
			
			
			
		}*/
		
		finally
		{
			System.out.println(res);
			System.out.println("successfull");
		}
		//int res = a/b;
		//System.out.println(res);
		//int arr[]={5,12,15,58,32,112,55,18};
		//System.out.println(arr[10]);
		/* calculate result
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
        at exceptionhandling.main(exceptionhandling.java:10)*/
		
		//System.out.println("successfull");
		
	}
}
/*OUTPUT: calculate result
Exception in thread "main" java.lang.ArithmeticException: / by zero
at exceptionhandling.main(exceptionhandling.java:7)
*/