import java.util.*;
class BubblePrac2{
	static void sort(int [] arr){
		boolean swapped;
		for(int i = 0; i< arr.length;i++){
			swapped = false;
			for(int j = 1; j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
					swapped = true;
				}
				
			}
			System.out.println(Arrays.toString(arr));
			if(!swapped)
				break;
		}
		//System.out.println(Arrays.toString(arr));
	}
	public static void main(String [] args){
		int arr[] = {13, 1,4,-10,45,-37,-4,3,39};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}