import java.util.*;

class ArraysQ3{
	public static void main(String [] args){
		
		int arr[] = {39,23,45,689,890,22,4,5,67,123,11111,32,14};
		int max = arr[0];
		int min = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(max<arr[i])
				max = arr[i];
			
			if(min>arr[i])
				min = arr[i];
			
			//System.out.println(max);
		}
		System.out.println(max);
		System.out.println(min);
		
		
    }

}	