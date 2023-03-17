import java.util.*;
class Q1{
	public static void main(String [] args){
		
		String str = "A man, a plan, a canal: Panama.";
		String str2 = str.toUpperCase();
		char [] ch = new char[21];
		int j = 0;
		for(int i= 0;i<str.length();i++){
			if(str2.charAt(i)!=' ' && str2.charAt(i)!=',' && str2.charAt(i)!='.' && str2.charAt(i)!=':'){
				ch[j] = str2.charAt(i); 
				j++;
			}
			
		}
		System.out.println(Arrays.toString(ch));
		Stack<Character> stk = new Stack<>();
		for(int i = 0; i<ch.length;i++){
			stk.push(ch[i]);
		}
		int count = 0;
		for(int i = 0; i<ch.length;i++){
			if(stk.pop()==ch[i]){
				count++;
			}
		}
		if(count==ch.length){
			System.out.println("palindrome");
		}
		
	}
 
}