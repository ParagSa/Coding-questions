import java.util.*;
public class isPrime{
	public static void main(String []args )
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(isPrime(num))
		{
			System.out.println("yesss");
			
		}else{
			System.out.println("nooo");
			
		}
		
		
		
	}
	public static boolean isPrime(int n)
	{
		 boolean isPrime = true;
        
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
		return isPrime;
	}
}	
		
		
		