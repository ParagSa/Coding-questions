import java.util.*;
public class giveMeArms {
	public static void main(String []args )
	{
		
		int limit =1000;
		for(int i = 1;i<=limit; i++ )
		{
			if(arms(i)){
				System.out.println("Armstrong number are "+i+" ");
				
			}
			
			
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
		
		
		int sum =0;
		int start = 0;
		while(k>0)
		{
			start = k %10;
			sum = sum + (int)Math.pow(start, count);
			k = k / 10;
		}
		
		return sum == l;
		
	
		
	}
	
}