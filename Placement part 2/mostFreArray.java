import java.util.*;
public class mostFreArray
{
	public static void main(String []args)
	{
		int []arr = {1,3,4,6,1,8,7,4,2,1,5,5,6,6,5,5,5};
		
		System.out.println(find(arr));
		
	}
	public static int find(int [] arr)
	{
		HashMap<Integer,Integer>map = new HashMap<>();
		
		int maxFre = 0;
		int mostEle= arr[0];
		for(int i =0; i<arr.length ;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count = map.get(arr[i]);
				count +=1;
				map.put(arr[i],count);
				if(count>maxFre)
				{
					maxFre = count;
					mostEle = arr[i];
					
				}
				
			}else{
				map.put(arr[i],1);
			}
			
		}
		return mostEle;
		
	}
}