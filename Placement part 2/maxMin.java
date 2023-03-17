import java.util.*;

class maxMin
{
	public static void main(String []args)
	{
		int []arr = {0,1,2,3,4,6};
		minMax(arr);
		
	}
	public static void minMax(int [] arr)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i< arr.length;i++)
		{
			if(arr[i] >max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println(max+" "+min);
		
	}
}