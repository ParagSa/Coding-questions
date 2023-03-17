import java.util.*;
class Question2{
	public static void main(String [] args){
		String s1 = "listen";
		String s2 = "Silenk";
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		int count=0;
		//System.out.println(s3);
		char ch1[] = s3.toCharArray();
		char ch2[] = s4.toCharArray();
		for(int i = 0; i<ch1.length ;i++){
			for(int j = 0 ; j<ch2.length;j++){
				if(ch1[i]==ch2[j]){
					count++;
				}
			}
		}
		if(count== ch1.length)
			System.out.println("is anagrams");
		
		System.out.println("Not anagrams");
		
	}
}