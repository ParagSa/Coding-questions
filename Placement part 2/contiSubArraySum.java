import java.util.*;

class contiSubArraySum
{
	public static void main(String []args)
	{
		int [] arr = {2,4,5,1,5,9,10,11,-2};
		int [] arr2= new int[arr.length] ;
		arr2 = findSubArray(arr);
		Arrays.toString(arr2);
		
	}
	public static int[] findSubArray(int [] arr , int target){
		int start = 0;
		int end = 0;
		int sum = arr[0];
		while(end<arr.length)
		{
			if(sum == target)
			{
				int [] subArray= new int [end-start+1];
				System.arraycopy(arr, start, subArray, 0, end - start + 1);
                return subArray;
				
			}
			else if (sum < target) {
                end++;
               if (end < arr.length) {
                 sum += arr[end];
                }
            }
			else
		    {
               sum -= arr[start];
               start++;
            }
			
		}
		return null;
		
		
	}
}