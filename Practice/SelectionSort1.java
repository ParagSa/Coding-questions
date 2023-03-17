import java.util.*;
class SelectionSort1{
	public static void main(String [] args){
		int arr[] = {12,-4,67,45,14,13,6,666,-71,553};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void sort(int arr[]){
		
		for(int i = 0; i < arr.length; i++){
			int last = arr.length-i-1;
			int maxIn = getMax(arr,0,last);
			swap(arr, maxIn, last);
		}
		
	}
	static int getMax(int arr[], int s, int e){
		int max = s;
		for(int i = s; i<=e;i++){
			if(arr[max]<arr[i]){
				max = i;
			}
		}
		return max;
	}
	static void swap(int arr[], int s, int e){
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
}