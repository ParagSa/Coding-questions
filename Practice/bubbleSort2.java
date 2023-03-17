import java.util.*;
class BubbleSort2{
	public static void main(String [] args){
		int arr[] = {12,-4,67,45,14,13,6,666,-71,553};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void sort(int []arr){
		boolean swapped;
		for(int i = 0; i<arr.length;i++){
			swapped = false;
			for(int j = 1; j <arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
			break;
		    }
			
		}
		
	}
}