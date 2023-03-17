import java.util.*;

class InsertionSort{
	public static void main(String [] args){
		int arr1[] = {5,4,3,2,1};
		insertion(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}
	static void insertion(int arr[]){     
		for( int i = 0; i<arr.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(arr[j]<arr[j-1]){
					int Insert = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= Insert;
					
				}else{
					break;
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}