import java.util.*;
class BinaryS1{
	public static void main(String [] args){
		int arr[] = {12,-4,67,45,14,13,6,666,-71,553};
		Arrays.sort(arr);
		int target = 67;
		
		int index = bs(arr, target);
		System.out.println(Arrays.toString(arr));
		System.out.println(index);
		
	}
	static int bs(int arr[], int target){
		int start = 0;
		int end = arr.length-1;
		while(start <= end){
			int mid = start + (end-start)/2;
			if(target < arr[mid]){
				end = mid -1;
			}else if(target>arr[mid]){
				start = mid +1;
			}else{
				return mid;
			}
		}
		return -1;
	
		
	}
}