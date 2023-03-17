
import java.util.*;
class Q3{
	
	public static void main(String [] args){
		String str = "UULDRDRLDDD";
		char []ch= str.toCharArray();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		boolean ans = false;
	
		for(int i = 0; i<ch.length;i++){
			
			if(ch[i]=='L'){
				count1++;
			}else if(ch[i]=='R'){
				count2++;
			}else if(ch[i]=='U'){
				count3++;
			}else{
				count4++;
			}
		}
		if(count1 == count2){
			if(count3==count4){
				ans = true;
				System.out.println(ans);
			}else{
	
				System.out.println(ans);
			}
			
		}else{
			System.out.println(ans);
		}

			
		
		
		
		
		
	}
	
}	