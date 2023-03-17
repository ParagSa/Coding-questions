import java.util.*;
class Q24{
	public static void main(String [] args){
		int []arr= {10,-34,-27,65,45,37,3,90,78,77};
		//int [] arr = new int [arr.length];
		Arrays.sort(arr);
		//System.out.print(Arrays.toString(arr));
		int max = 0;
		int temp = 0;
		for(int i = 0;i<arr.length;i++){
			
		    
			if(max<arr[i]){
				max = arr[i-1];
			}
			
			
		}
		System.out.println(max);
		//System.out.println(temp);
		
		
	}
}