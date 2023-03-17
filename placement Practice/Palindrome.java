import java.util.*;
public class Palindrome{
	public static void main(String[] args){
		String str = "abcdefg";
		//char [] pali = str.toCharArray();
		//char [] temp = new char[str.length];
		String ans = "";
		for(int i =str.length()-1; i>=0;i--)
		{
			ans += str.charAt(i);
			
			
		}
		if(str.equals(ans)){
			System.out.println("yesss");
		}
		
			
	}
}