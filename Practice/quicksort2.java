import java.util.*;
class quicksort2{
	public static void main(String [] args){
		int arr[] = {12,-4,67,45,14,13,6,666,-71,553};
		
		sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void sort(int arr[], int low, int high){
		if(low>=high){
			return;
		}
		int start = low;
		int end = high;
		int mid = start + (end-start)/2;
		int pivot = arr[mid];
		while(start<=end){
			while(arr[start]<pivot){
				start++;
			}
			while(arr[end]> pivot){
				end--;
			}
			if(start<=end){
				int swap = arr[start];
				arr[start] = arr[end];
				arr[end] = swap;
				start++;
				end--;
			}
			
		}
		sort(arr, low, end);
		sort(arr,start, high);
		
	}
	
	
}