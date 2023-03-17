import java.util.*;

class Median
{
	public static void main(String []args)
	{
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
		//Scanner sc = new Scanner(System.in);
		//int k = sc.nextInt();
		med(arr);
		
		
		
	}
	public static void med(int[] nums) {
		int []r = new int[nums.length-2];
		for(int i =1, j =0;j<nums.length-2; j++,i++ )
		{
			r[j] = (int)Math.ceil((double)(nums[i-1]+nums[i+1])/2);
		}
		for(int i :r){
			System.out.print(i+" ");
			
		}
    
    }
}