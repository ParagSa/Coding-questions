import java.util.*;

class bubbleSort
{
	public static void main(String []args)
	{
		int [] arr = {2,4,5,1,5,9,10,11,-2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void sort(int [] arr){
		boolean swap = false;
		for(int i = 0; i< arr.length;i++){
			for(int j= 1;j<arr.length;j++ ){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp ;
					swap = true;
					
				}
				
			}
			if(!swap){
				break;
			}
		}
	}
}