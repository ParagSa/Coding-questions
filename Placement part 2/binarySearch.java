import java.util.*;

class binarySearch
{
	public static void main(String []args)
	{
		int [] arr = {2,4,5,1,5,9,10,11,-2};
		Arrays.sort(arr);
		System.out.println(binarys(arr,  11));
		
	}
	public static int binarys(int [] arr, int target){
		int start = 0;
		int end = arr.length -1;
		while(start<=end){
			int mid = start+(end-start)/2;
			if(target== arr[mid]){
				return mid-1;
			}else if(target> arr[mid]){
				start = mid+1;
				
			}else{
				end = mid-1;
			}
			
		}
		return -1;
		
		
		
	}
}