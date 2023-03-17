import java.util.*;
class Q4{
	static double sum = 0;
	public static void main(String [] args){
		
		String str = "1011110";
		
		char [] ch = str.toCharArray();
		int count = ch.length-1;
		
		for(int i = 0; i<ch.length;i++){
			if(ch[i]=='1'){
				sum = sum + Math.pow(2,count);
			}
			
			count--;
		}
		System.out.println(sum);
		
		
		
	}
	
}	