import java.util.*;
class InsertionPrac{
	public static void main(String[] args){
		int arr [] = {12,6,-19,45,-17,30,4,67,1,0};
		insert(arr);
		System.out.print(Arrays.toString(arr));
		
	}
	static void insert(int [] arr){
		for(int i = 0;i<arr.length-1;i++){
			for(int j = i+1;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]= temp;
				}else{
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}
}