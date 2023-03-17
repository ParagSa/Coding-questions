import java.util.*;
class secondMin
{
	public static void main(String []args)
	{
		int []arr2 = {2,-4,5,-1,-8,9,-2};
		System.out.println(min(arr2));
	}
	public static int min(int []arr){
		 int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

		for(int i =0; i< arr.length;i++)
		{
			
			if(arr[i]<min ){
				secondMin = min;
				min = arr[i];
				
			} else if (arr[i] < secondMin && arr[i] != min) {
            secondMin = arr[i];
            }
			
			
			
		}
		   return secondMin;
		
	}
}