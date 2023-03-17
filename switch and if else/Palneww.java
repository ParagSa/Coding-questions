import java.util.*;
class Palneww{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String rev ="";
		int l = num.length();
		for(int i = l-1;i>=0;i--){
			rev = rev + num.charAt(i);
			
		}
		if(num.equals(rev))
			System.out.println("palindrome");
		
		
		
	}
}