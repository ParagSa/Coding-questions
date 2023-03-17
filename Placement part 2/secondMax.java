import java.util.*;

class secondMax
{
	public static void main(String []args)
	{
		int []arr2 = {2,-4,5,-1,-8,9,-2};
		System.out.println(secMax(arr2));
		
	}
	public static int secMax(int []arr)
	{
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i= 0; i< arr.length; i++)
		{
			if(arr[i]>max){
				secMax = max;
				max = arr[i];
			}else if(arr[i]>max && arr[i]!= max){
				secMax = arr[i];
				
			}
			
		}
		return secMax;
		
	}
}