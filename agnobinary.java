import java.util.*;
class agnobinary{
	public static void main(String args[]){
		int arr2[] = {100,89,73,65,52,33,23,19,7,-2,-7};
		int tar = -7;
		int ans = agnoisticbinarySearch(arr2,tar);
		System.out.println(ans);
		
	}
	static int agnoisticbinarySearch(int arr[], int target){
		int s = 0;
		int e = arr.length-1;
		boolean isAsc = arr[s]< arr[e];
		
		
		while(s <=e){
			int mid = s + (e-s)/2;
			if (arr[mid]==target){
				return mid;
				
			}
			if(isAsc){
				if(target<arr[mid])
				{
				  e = mid -1;
			    }else
				{
				   s = mid +1;
				
			    }
				
			}
			else{
				
				if(target>arr[mid])
				{
				   e = mid -1;
			    }
				else
				{
				   s = mid +1;
				
			    }
			}
		}
		return -1;
	}
}