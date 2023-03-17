import java.util.*;
class capital{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write something");
		String word = sc.nextLine();
		for(int i = 0; i<word.length() ;i++){
			if(Character.isUpperCase(word.charAt(i)) || Character.isUpperCase(word.charAt(0))){
				System.out.println("true");
			}	
			else
				System.out.println("false");
				
		}
		
	}
}