import java.util.*;
public class anagram
{
    public static void main(String []args)
    {
		String s1 = "newyorktimes";
		String s2 = "monkeyswritl";
		System.out.println(find(s1,s2));
		
	}
	public static boolean find(String s1, String s2){
		int []count = new int[256];
		
		if(s1.length()!= s2.length()){
			return false;
			
		}
		for(int i = 0; i<s1.length();i++)
		{
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
			
			
		}
		for(int i = 0; i<count.length;i++)
		{
			if(count[i]!=0)
			{
				return false;
				
			}
			
		}
		return true;
	}
}