import java.util.*;
class fibonacci
{
	public static void main(String []args)
	{
		int num = 9;
		System.out.println(fibo(num));
		
		
	}
	public static int fibo(int num)
	{
		if(num<=1){
			return num;
		}
		return fibo(num-1)+ fibo(num-2);
		
		
	}
}