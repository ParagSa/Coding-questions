import java.util.*;
class InsertionPra2{
	static void sort(int [] arr){
		for(int i = 0; i< arr.length-1 ;i++){
			for (int j = i+1; j>0;j--){
				if(arr[j]<arr[j-1]){
					int insert = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = insert;
				}else{
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String [] args){
		int arr[] = {13, 1,4,-10,45,-37,-4,3,39};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}