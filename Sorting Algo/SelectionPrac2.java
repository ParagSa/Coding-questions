import java.util.*;
class SelectionPrac2{
	public static void main(String [] args){
		int arr[] = {13, 1,4,-10,45,-37,-4,3,39};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void sort(int []arr){
		for(int i = 0; i < arr.length; i++){
			int last = arr.length-i-1;
			int max = getMaxE(arr, 0,last);
			swap(arr,max, last);
		}
		
	}
	static int getMaxE(int [] arr, int s,int last){
		int max = s;
		for(int i = s; i <= last; i++){
			if(arr[i]>arr[max]){
				max = i;
			}
		}
		return max;
	}
	static void swap(int arr[], int f, int s){
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}
}