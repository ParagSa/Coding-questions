import java.util.*;

class missingNumber
{
	public static void main(String []args)
	{
		int []arr = {0,1,2,3,4,6};
		System.out.println(missNum(arr));
		
	}
	public static int missNum(int [] arr)
	{
		int expectedSum = arr.length*(arr.length+1)/2;
		int actualSum =0;
		for(int i = 0; i< arr.length;i++)
		{
			actualSum +=arr[i];
			
		}
		return expectedSum - actualSum;
		
		
	}
}