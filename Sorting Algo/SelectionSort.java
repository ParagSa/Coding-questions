import java.util.*;
class SelectionSort{
	public static void main(String [] args){
		int arr1[] = {-4,7,2,-37,-10,66,77,8};
		selection(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}
	static void selection(int arr[]){
		for(int i = 0; i <arr.length;i++){
			int last = arr.length-i-1;
			int maxIn  = getMaxIn(arr, 0,last);
			swap(arr,maxIn,last);
		}
	}
	static int getMaxIn(int [] arr, int s, int e){
		int max = s;
		for(int i = s;i<=e;i++){
			if(arr[max]<arr[i]){
				max = i;
			}
		}
		return max;
	}
	static void swap(int [] arr, int f, int s){
		int temp = arr[f];
		arr [f] = arr[s];
		arr[s] = temp;
	}
	
}