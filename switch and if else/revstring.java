import java.util.*;
class revstring{
	public static void main(String [] args){
		char ch;
		String rev ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String w = sc.nextLine();
		for(int i = 0;i< w.length();i++){
			ch = w.charAt(i);
			rev = ch+rev;
			
		}
		System.out.println(rev);
		
		
	}
}