import java.util.*;
class QuickPrac{
	public static void main(String [] args){
		int arr[] = {-4,7,2,-37,-10,66,77,8};
		sort(arr, 0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	static void sort(int [] arr, int low,int high){
		if(low>=high){
			return;
		}
		int s = low;
		int e = high;
		int mid = s +(e-s)/2;
		int pivot = arr[mid];
		
		while(s<=e){
			while(arr[s]<pivot){
				s++;
			}
			while(arr[e]>pivot){
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
		sort(arr,low,e);
		sort(arr,s,high);
	}
}
