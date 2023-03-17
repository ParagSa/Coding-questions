import java.util.*;
public class ArmstrongNumber {
	public static void main(String []args )
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(arms(n)){
			System.out.println("yess");
			
		}else{
			System.out.println("noo");
		}
		
		
	}
	public static boolean arms(int num)
	{
		int k = num;
		int l = num;
		int count = 0;
		while(num>0){
			num /=10;
			count++;
			
		}
		System.out.println("count "+count);
		
		int sum =0;
		int start = 0;
		while(k>0)
		{
			start = k %10;
			sum = sum + (int)Math.pow(start, count);
			k = k / 10;
		}
		System.out.println("sum  "+sum);
		return sum == l;
		
	
		
	}
	
}