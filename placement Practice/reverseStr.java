import java.util.*;
public class reverseStr{
	public static void main(String [] args){
		 String str = "I Love India";
		 
		 
		 String []arr = str.split("\\s");
		 String ans = "";
		 for(int i = 0; i<arr.length;i++)
		 {
			String a = arr[i];
			if(a.length()==1){
				ans +=a+" ";
			}else{
				for(int j=a.length()-1; j>=0; j-- )
				{
					ans +=a.charAt(j);
					
				}
				ans +=" ";
			}
			 
			 
		 }
		 System.out.println(ans);
		
	}
}