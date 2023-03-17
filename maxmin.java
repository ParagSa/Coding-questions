import java.util.*;
class maxmin{
	public static void main(String args[]){
		int max;
		int min;
		int arr[] = {-12,-10,1,12,13,65,199,200,300};
		//int arr2[]= new int[arr.length];
		max = arr[0];
		for(int i = 0;i<arr.length;i++){
			/*for(int j = i+1;j<arr.length;j++){
				int temp = 0;
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					
					
					
				}
				
			}*/
			
			if(arr[i]>max){
				max = arr[i];
			}
			
			//System.out.println(max);
		
			
		}System.out.println(max);
		
	}
}