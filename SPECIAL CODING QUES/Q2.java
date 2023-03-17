import java.util.*;
class Q2{
	public static void main(String [] args){
		String str1 = "IND";
		String str2 = "Parag";
		String str3 = "PaRag";
		String str4 = "sane";
		String str5 = "Pranav";
		char [] ch = str1.toCharArray();
		boolean flag= false;
		int count = 0;
		for(int i = 0; i<ch.length;i++){
			int check = Character.toUpperCase(ch[i]);
			int check2 = Character.toUpperCase(ch[0]);
			int check3 = Character.toLowerCase(ch[0]);
			int check4 = Character.toLowerCase(ch[i]);
			if(ch[0]== check2 && ch[i]==check || ch[0]== check3 && ch[i]==check4 ){
				count++;
			}
				
		}
		if(count== ch.length || count==1){
			flag =true;
			System.out.println(flag);
		}else{
			System.out.println(flag);
		}
		
		
		
		
		
		
	}
	
}