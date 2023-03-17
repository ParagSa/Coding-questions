import java.util.*;
class revNum
{
	public static void main(String []args)
	{
		int y = 0;
		int a = 12345;

		while(a>0)
		{
			
			 y = y *10+ a%10;
			
			a /=10;
			//a/=10;
			
			
			
			
		}
		System.out.println(y);
		
	}
}