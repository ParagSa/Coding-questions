import java.util.*;
class RecurChar{
	public static void main(String [] args){
		System.out.print(skipapple("baccappled"));
	}
	static void skip(String p, String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		if(ch=='a'){
			skip(p,up.substring(1));
		}else{
			skip(p+ch,up.substring(1));
		}
	}
	static String skip( String up){
		if(up.isEmpty()){
			
			return "";
		}
		char ch = up.charAt(0);
		
		if(ch=='a'){
			return skip(up.substring(1));
		}else{
			return ch+skip(up.substring(1));
		}
	}
	static String skipapple(String up){
		if(up.isEmpty()){
			
			return "";
		}
		//String 
		
		if(up.startsWith("apple")){
			return skipapple(up.substring(5));
		}else{
			return up.charAt(0)+skipapple(up.substring(1));
		}
	}
}