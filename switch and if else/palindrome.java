import java.util.*;
class palindrome{
	String rev(){
		char ch;
		String rev = "";
		System.out.println("Write Something");
		Scanner sc = new Scanner(System.in);
		String pal = sc.nextLine();
		for(int i = 0;i< pal.length();i++){
			ch = pal.charAt(i);
			rev = ch+rev;
			
		}
		
		if(pal.compareTo(rev)==0){
			System.out.println("yes it is a palindrome");
			
		}else
			
			return "Not";
		
			
			
		
		
	return "n";}
	
	public static void main(String [] args){
		
		palindrome p = new palindrome();
		p.rev();
		
		
		
	}
}