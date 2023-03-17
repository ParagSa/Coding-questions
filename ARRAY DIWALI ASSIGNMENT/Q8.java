import java.util.*;
class Q8{
	static int count;
	public static void main(String [] args){
		int arr[] = {5,14,35,89,140};
		
		for(int i = 0; i<arr.length;i++){
			
				int s = arr[i]+arr[i+1]+arr[i+2];
				int ans = s/3;
				System.out.println(ans);
		}
		
		
		
		
		
	}
	
}	