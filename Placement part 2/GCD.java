import java.util.*;

public class GCD
{
	public static void main(String []args)
	{
		int num1=252;
		int num2 = 105;
		 gcd(num1, num2);
		
	}
	public static void gcd(int num1, int num2)
	{
		if(num1==num2){
			System.out.println(num1);
			return;
		}
		if(num1>num2){
			gcd(num1-num2, num2);
			
		}else{
			gcd(num1, num2-num1);
			
		}
		
	}
}