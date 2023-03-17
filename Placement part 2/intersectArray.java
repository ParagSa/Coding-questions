import java.util.*;

class intersectArray
{
	public static void main(String []args)
	{
		int [] arr1 = {1,3,4,5,2,6,8,9};
		int [] arr2 = {10,3,40,5,20,6,8,9};
		int [] ans = findintersection(arr1, arr2);
		System.out.println();
		
	}
	public static int[] findintersection(int []arr1, int []arr2)
	{
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for(int num: arr1){
			set1.add(num);
		}
		for(int num: arr2){
			set1.add(num);
		}
		set1.retainAll(set2);
		int[] result = new int[set1.size()];
        int i = 0;
		for(int num: set1){
			result[i++] = num;
		}
		return result;
		
	}
}