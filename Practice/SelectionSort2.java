import java.util.*;
class SelectionSort2{
	public static void main(String [] args){
		int arr[] = {12,-4,67,45,14,13,6,666,-71,553};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void sort(int [] arr){
		for(int i = 0; i < arr.length;i++){
			int last = arr.length-i-1;
			int max = getMaxIn(arr,0,last);
			swap(arr,last,max);
		}
		
	}
	static void swap(int [] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	static int getMaxIn(int []arr, int a, int b ){
		int max = a;
		for(int i= a;i<=b;i++){
			if(arr[max]<arr[i]){
				max = i;
			}
		}
		return max;
	}
}	