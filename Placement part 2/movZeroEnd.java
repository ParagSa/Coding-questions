import java.util.*;
class movZeroEnd
{
	public static void main(String []args)
	{
		int []arr = {0,3,0,6,1,0,7,4,0,1,5,0,6,6,5,0,5};
		
		move(arr);
		
	}
	public static void move(int []arr)
	{
		int j = arr.length-1;
		for(int i = arr.length-1; i >=0 ; i--)
		{
			if(arr[i]==0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}