import java.util.*;
class QuickSort{
	public static void main(String [] args){
		int arr1[] = {1,4,2,3,6,5};
		sort(arr1,0,arr1.length-1);
		System.out.println(Arrays.toString(arr1));
		
	}
	static void sort(int [] arr,int low,int high){
		if(low >= high){
			return;
		}
		int s = low;
		int e = high;
		int mid = s+(e-s)/2;
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
				arr[s]=arr[e];
				arr[e]=swap;
				s++;
				e--;
			}
			
		}
		sort(arr,low,e);
		sort(arr,s,high);
		
		
	}
}