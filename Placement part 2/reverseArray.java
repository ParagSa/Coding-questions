import java.util.*;
public class reverseArray
{
	public static void main(String []args)
	{
		int []arr = {12,3,2,5,6,23,46,78};
		rev(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static int[] rev(int []arr)
	{
		int front = 0;
		int end = arr.length -1;
		while (front< end)
		{
			int temp = arr[front];
			arr[front] = arr[end];
			arr[end] = temp;
			
			front++;
			end--;
			
		}
		return arr;
		
		
	}
}