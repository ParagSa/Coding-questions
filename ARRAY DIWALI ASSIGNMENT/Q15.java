import java.util.*;
class Q15{
	public static void main(String [] args){
		int arr[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,10};
		//int sum = 0;
		int count = 0;
		//boolean flag;
		for(int i = 0; i<arr.length;i++){
			for(int j = 0; j <arr2.length;j++){
				if(arr[i]== arr2[j]){
				 count++;
				}
			}
		}
		if(count == arr2.length)
			System.out.println("Contains all");
		
		
		
		
	}
	
}	