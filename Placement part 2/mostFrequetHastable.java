import java.util.*;
public class mostFrequetHastable
{
	public static void main(String []args)
	{
		int [] arr = {1,3,4,6,1,8,7,4,2,1,5};
		System.out.println(mostFrequent(arr));
		
		
	}
	
	public static int mostFrequent(int []arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		int mostFreEle = 0;
		int maxFreq = 0;
		for(int i =0; i<arr.length;i++)
		{
			int currEle = arr[i];
			int currFre = map.getOrDefault(currEle,0)+1;
			map.put(currEle,currFre);
			if(currFre>maxFreq){
				maxFreq = currFre;
				mostFreEle = currEle;
				
				
			}
			
		}
		return mostFreEle;
		
	}
}	
