import java.util.*;
class InsertionSort1{
	public static void main(String [] args){
		int arr[] = {12,-4,67,45,14,13,6,666,-71,553};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void sort(int []arr){
		for(int i = 0; i< arr.length-1; i++){
			for(int j = i+1; j>0;j--){
				if(arr[j-1]>arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}else{
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
}	