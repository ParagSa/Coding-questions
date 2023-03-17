import java.util.*;
class QuickSort1{
	public static void main(String [] args){
		int arr[] = {12,-4,67,45,14,13,6,666,-71,553};
		
		sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void sort(int arr[], int low, int high){
	    if(low>= high){
			return;
		
	    }
		int s = low;
		int e = high;
		int mid = s+(e-s)/3;
		int pivot = arr[mid];
		while(s<=e){
			while(arr[s]<pivot){
				s++;
			}
			while(arr[e]> pivot){
				e--;
			}
			if(s<=e){
				int swap = arr[s];
				arr[s] = arr[e];
				arr[e] = swap;
				s++;
				e--;
			}
		}
		sort(arr, low , e);
		sort(arr, s, high);
	}
	
}