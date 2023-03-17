import java.util.*;
class FloorDemo{
	public static void main(String [] args){
		int arr2[] = new int[]{13,24,45,67,72,81,89,93,95};
		System.out.println(arr2[floor(arr2,51)]);
		
		//System.out.println(num);
	}
	
	static int floor(int arr[],int target){
		int s = 0;
		int e = arr.length - 1;
		
		while(s<=e){
			int mid = s + (e-s)/2;
			if(target<arr[mid]){
				e = mid -1;
				
			}else if (arr[mid]<target){
				s = mid +1;
			}else{
				return mid;
			}
			
		}
		return e;
	}
}