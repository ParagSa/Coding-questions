import java.util.*;
class Q10{
	public static void main(String [] args){
		int arr[] = {65,14,129,34,7};
		//int arr2[] = {4,5,6,8,1};
		//int sum = 0;
		//int count = 0;
		//boolean flag;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i<arr.length;i++){
			for(int j = i+1; j <arr.length;j++){
				if(arr[i]<arr[j]){
					count++;
					if(count == arr.length){
						System.out.println("Ascend");
						//count=0;
					}
				}
				if(arr[i]>arr[j]){
					count1++;
					if(count1 == arr.length){
						System.out.println("Desend");
						//count1= 0;
					}

				}
				count2++;
					
			}
			if(count2 == arr.length){
			System.out.println("random");
			//count2 = 0;
		   }
		}
		
		
		
		
		
	}
	
}	