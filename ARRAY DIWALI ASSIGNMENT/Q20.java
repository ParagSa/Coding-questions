import java.util.*;
	class Q20{
	public static void main(String [] args){
		
		
		int arr[] = {0,-34,0,65,45,0,3,90,78,77};
		boolean swapped;
		for(int i = 0; i<arr.length;i++){
			swapped = false;
		    for(int j= i+1;j<arr.length;j++){
				if(arr[i]==0){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped=true;
				}
		    }
			if(!swapped){
				break;
			}
		}
		
		System.out.print(Arrays.toString(arr));
		
		
	}
 
}