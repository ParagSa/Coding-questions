import java.util.*;
public class giveMePrimeFactors
{
	public static void Factors(int num)
	{
		
		for(int i = 1; i <=num ; i++)
		{
			
			if(num%i==0 && isPrime(i))
			{
				System.out.println(i);
			}
			
		}
		
		
		
	}
	public static boolean isPrime(int n)
	{
		boolean isPrime = true;
		if(n<= 1)
		{
			isPrime = false;
		}else{
			for(int i = 2;i<= Math.sqrt(n);i++){
				 if (n % i == 0) {
                    isPrime = false;
                    break;
                }
			}
		}
		return isPrime;
		
	}
	public static void main(String []args )
	{
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
	    Factors(a);
		
		
	}
}