import java.util.*;
class Question3{
	public static void main(String [] args){
		String str = "raragsane";
		char [] ch = str.toCharArray();
		int count=0;
		for(int i = 0; i<ch.length;i++){
			for(int j = i;j<ch.length;j++){
				if(ch[i]!=ch[j]){
					//System.out.println(ch[i]);
					count++;
					break;	
				}
					
				
				
			}
			if(count==1){
				System.out.println(ch[i]);
			}
		}
		
		
	}
}