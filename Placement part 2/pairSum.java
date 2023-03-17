import java.util.*;
public class pairSum
{
	public static void main(String []args)
	{
		int []arr = {45,6,8,9,2,4,0,3,1,10};
		int z = 10;
		for(int i =0;i<arr.length;i++){
			//int count =0;
			for(int j =i; j<arr.length;j++){
				if(i!=j){
					int res =arr[i]+arr[j];
					if(res==z)
					{
						System.out.println(arr[i]+" + "+arr[j]+" = "+z+"");
						
					}
					
				}
			}
		}
		
	}
}
