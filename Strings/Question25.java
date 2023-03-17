import java.util.*;

class Question25{
	
	public static void main(String [] args){
		String str = "radar";
		
		char [] ch = str.toCharArray();
		char rev[] = new char[ch.length];
		
		Stack<Character> stk = new Stack<Character>();
		for(int i =0; i< ch.length;i++){
			stk.push(ch[i]);
			rev[i]=stk.pop();
		}
		/*char d=stk.pop();
		System.out.println(d);
		char s=stk.pop();
		System.out.println(s);*/
		
		
		String str3 = new String(rev);
		//String str4 = new String(ch);
		
		if(str3.equals("radar")){
			System.out.println("palindrome");
		}
		
	}
	
}	