import java.util.*;

class ArraysQ2{
	public static void main(String [] args){
		
		//int ans = 5;
		
		int arr[] = {1,23,45,689,890,22,4,5,67,123,11111,32,14};
		for(int i = 0; i<arr.length;i++){
			for(int j = i; j<arr.length;j++){
				int ans = 5;
				if((arr[i]+arr[j])==ans & i!=j ){
					System.out.println(i+" , "+j);
					//continue;
				}	
			}
		}
    }
		
}
