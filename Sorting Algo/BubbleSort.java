import java.util.*;
class BubbleSort{
	public static void main(String [] args){
		int arr1[] = {-4,5,-3,1,-2};
		bubble(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}
	static void bubble(int []arr){
		boolean swapped;
		for(int i = 0;i<arr.length;i++){
			//int flag = 0;
			swapped = false;
			for(int j = 1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
					//flag = 1;
					swapped = true;
				}
			}
			//if(flag == 0)
			if(!swapped)	
				break;
		}
	}
	
}