import java.util.*;
public class UniQueChar2
{
    public static void main(String []args)
    {
		String str = "AABCDEEEF";
		System.out.println(unique(str));
	}
	public static String unique(String input)
	{
		int left=0;
		int start=0; 
		int max=0;
		int right =0;
		Set<Character> visited = new HashSet<>();
		while(right<input.length())
		{
			if(!visited.contains(input.charAt(right)))
			{
				visited.add(input.charAt(right));
				right++;
				if((right-left)>max)
				{
					max = right-left;
					start = left;
					
				}
				
			}else{
				visited.remove(input.charAt(left));
				left++;
				
				
			}
			
		}
		return input.substring(start,start+max);
		
	}
}