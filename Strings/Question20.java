import java.util.*;
class Question20{
    static String remove(String str, char ch){
		char [] ch2 = str.toCharArray();
		char [] ch3 = new char[ch2.length-1];
		int j = 0;
		int count= 0;
		for(int i =0; i< ch2.length; i++ ){
			if(ch2[i]!=ch){
				ch3[j]=ch2[i];
				j++;
			}
			if(ch2[i]==ch){
				count++;
				if(count==1){
					ch='0';
				}
			}
		}
		String str2 = new String(ch3);
		return str2;
	} 
	public static void main(String [] args){
		String str = "Parag";
		System.out.println(remove(str , 'a'));
	}
}