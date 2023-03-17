import java.util.*;
public class repeatedSequence
{
	public static void main(String []args)
	{
		String str = "abcabcabcd";
		System.out.println(sequence(str));
		
	}
	public static boolean sequence(String str)
	{
		return((str+str).indexOf(str,1)!=str.length());
		
	}
}
