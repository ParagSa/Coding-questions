import java.util.*;
public class balancedBracket
{
    public static void main(String []args)
    {
		String str = "(()()())(())";
		System.out.println(check(str));
		
	}
	public static boolean check(String str)
	{
		Stack<Character> stk = new Stack<>();
		for(int i = 0; i<str.length();i++)
		{
			if(stk.isEmpty()){
				stk.push(str.charAt(i));
			}else if(stk.peek()=='(' && str.charAt(i)==')'){
				stk.pop();
			}else if(stk.peek()==')' && str.charAt(i)=='('){
				stk.pop();
				
			}else{
				stk.push(str.charAt(i));
			}
			
		}
		return stk.isEmpty();
	
	}
}