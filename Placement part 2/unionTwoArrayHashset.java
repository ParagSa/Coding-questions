import java.util.*;
class unionTwoArrayHashset
{
	public static void main(String []args)
	{
		int []arr1 = {1,2,4,5,6};
		int []arr2 = {2,4,5,8,9};
		
		System.out.println(Arrays.toString(union(arr1,arr2)));
		
		
		
		
		
	}
	public static int[] union(int []arr1,int []arr2)
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int i =0; i<arr1.length;i++){
			set.add(arr1[i]);
			
		}
		
		for(int i =0; i<arr2.length;i++){
			if(!set.contains(arr2[i]))
			{
				set.add(arr2[i]);
			}
		}
		int [] union = new int[set.size()];
		int i =0;
		for(int item: set){
			union[i]= item;
			i++;
			
		}
		return union;
		
		
	}
}