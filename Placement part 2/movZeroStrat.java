import java.util.*;
class movZeroStart
{
	public static void main(String []args)
	{
		int []arr = {0,3,0,6,1,0,7,4,0,1,5,0,6,6,5,0,5};
		
		move(arr);
		
	}
	public static void move(int []arr)
	{
		int j = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]==0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}