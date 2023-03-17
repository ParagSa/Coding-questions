import java.util.*;

class CycleSort{
	public static void main(String [] args){
		int arr1[] = {1,4,2,3,6,5};
		cycle(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}
	static void cycle(int arr[]){
		int i = 0;
		
		while(i<arr.length){
			int correct = arr[i] -1;
			if(arr[i]!=arr[correct]){
			    swap(arr,i,correct);
			}else{
				i++;
			}
			System.out.println(Arrays.toString(arr));
		}
		/*for(int i = 0;i<arr.length;++){
			if(arr[i]!=i+1){
				int swap = arr[i];
				arr[i] = arr
			}else{
				break;
			}
		}*/
		
		
	}
	static void swap(int arr[], int i, int correct){
		int temp = arr[i];
		arr[i]= arr[correct];
		arr[correct] = temp;
	}
}