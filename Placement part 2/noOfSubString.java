import java.util.*;
public class noOfSubString{
	public static void main(String []args)
	{
		String str = "aabbbaa";
		int ans = sub(str);
		System.out.print(ans);
	}
	public static int sub(String str){
		int count = 0;
		for(int i =0; i<str.length();i++){
			
			count += findSub(str, i-1,i+1);
			count += findSub(str, i,i+1);
			
		}
		return count;
		
	}
	public static int findSub(String str, int j, int k){
		int count=0;
		for(;j>=0 && k<str.length();--j,++k)
		{
			if(str.charAt(j)!= str.charAt(k)){
				break;
				
			}
			System.out.println(str.substring(j,k+1));
			count++;
			
		}
		return count;
		
	}
	
}