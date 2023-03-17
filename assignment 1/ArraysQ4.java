import java.util.*;

class ArraysQ4{
	public static void main(String [] args){
		 int j = 0;
		int arr[] = {39,23,45,689,890,22,4,5,67,123,11111,32,14};
		int arr1[]= new int[20];
		int max = arr[0];
		int min = arr[0];
		for(int i = arr.length-1; i>=0;i--){
			arr1[j] = arr[i];
			System.out.println(arr1[j]);
			j++;
		}
		
		
		
    }

}	