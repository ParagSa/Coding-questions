import java.util.*;

class countOccur
{
	public static void main(String []args)
	{
		int []arr = {1,3,1,0,2,0,3,0,2,0,0,2,1,1,2,1,0,3};
        occur(arr);
		
	}
	public static void occur(int []arr)
	{
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i =0; i <arr.length;i++)
		{
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				map.put(arr[i],count+1);
			}else{
				map.put(arr[i],1);
			}
		}
		for(int key:map.keySet()){
			System.out.println(key +" : "+map.get(key));
		}
		
	}
}