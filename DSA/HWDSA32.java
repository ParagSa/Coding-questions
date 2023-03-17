import java.util.*;
class HWDSA32{
    public static void main(String [] args){
		String regex1 = "[a-zA-Z]";
		String s = "%parag'to @cdacmumBai?<s";
		Character c[] = new Character [s.length()];
		for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
		for(Character ch : c){
			
			if(ch.equals(regex1)){
				System.out.print(ch);
	        }
			if(ch.equals(" ")) {
				System.out.print(ch);
			}
		}
	}
}