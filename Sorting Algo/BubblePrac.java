import java.util.*;
class BubblePrac{
	public static void main(String[] args){
		int arr [] = {12,6,-19,45,-17,30,4,67,1,0};
		bubble(arr);
		System.out.print(Arrays.toString(arr));
		
	}
	static void bubble(int arr []){
		boolean swapped;
		for(int i = 0;i<arr.length;i++){
		    swapped = false;
			for(int j = 1; j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]= temp ;
					//System.out.println();
					System.out.println(Arrays.toString(arr));
					swapped=true; 
				}
			}
			if(!swapped)
				break;
		}
	}
}