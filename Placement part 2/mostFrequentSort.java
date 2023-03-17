import java.util.*;
public class mostFrequentSort
{
	public static void main(String []args)
	{
		int []arr = {1,3,4,6,1,8,7,4,2,1,5,5,6,6,5,5,5};
		
		System.out.println(sorting(arr));
		
		
	}
	public static int sorting(int []arr){
		Arrays.sort(arr);
		int currEle = arr[0];
		int currFre = 1;
		int maxFre = 1;
		int most = arr[0];
		for(int i =1; i<arr.length;i++){
			if(currEle==arr[i]){
				currFre++;
				
			}else{
				if(currFre>maxFre){
					maxFre = currFre;
					most= currEle;
					
					
					
				}
				currEle = arr[i];
                currFre = 1;
			}
			
		}
		if(currFre>maxFre){
			maxFre = currFre;
	       most = currEle;
			
		}
		return most;
		
		
	}
}