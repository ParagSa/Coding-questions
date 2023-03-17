import java.util.*;

class maxConcOne
{
	public static void main(String []args)
	{
		int []arr = {1,1,1,0,1,0,1,0,1,0,0,0,1,1,1,1,0,0};
		System.out.println(binaryMax(arr));
		
	}
	public static int binaryMax(int []arr){
		int count =0;
		int maxCount = 0;
		for(int i = 0; i< arr.length-1;i++){
			if(arr[i]==1)
			{
				count++;
				maxCount = Math.max(maxCount, count);
				
				
			}else{
				count=0;
				
			}
		}
		return maxCount;
	}
}