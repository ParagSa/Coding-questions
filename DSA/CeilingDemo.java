import java.util.*;

class CeilingDemo{
	public static void main(String [] args)
	{
		int arr2[] = new int[]{12,23,42,52,68,98};
		//int target = 50;
		
		System.out.println(arr2[ceil(arr2,70)]);
	}
	static int ceil(int arr[], int target){
		int s = 0;
		int e = arr.length -1;
		while(s<=e){
			int mid = s + (e-s)/2;
			if(target < arr[mid]){
				e = mid -1;
			}
			else if(target >arr[mid]){
				s = mid + 1;
				
			}
			
			else{
				return mid;
			}
			
		}
		return s;
		
		
	}
	
}