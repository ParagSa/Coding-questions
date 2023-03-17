import java.util.*;
class SelectionPrac{
	public static void main(String [] args){
		int arr[] = {-4,7,2,-37,-10,66,77,8};
		selection(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void selection(int [] arr){
		for(int i = 0;i<arr.length; i++){
			int last = arr.length-i-1;
			int maxE = getMax(arr,0,last);
			swapp(arr,maxE,last);
			
		}
	}
	static int getMax(int [] arr, int s,int e){
		int max = s;
		for(int i = s; i<=e; i++){
			if(arr[max]<arr[i]){
				max = i;
			}
		}
		return max;
	}
	static void swapp(int []arr,int f, int s ){
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}
}