import java.util.*;
class Q23{
	public static void main(String [] args){
		ArrayList <String>arr = new ArrayList<String>();
		arr.add("parag");
		arr.add("ritesh");
		arr.add("pranav");
		arr.add("prachi");
		//System.out.println(arr.get(0));
		String str[] = new String[arr.size()];
		for(int i = 0 ; i<str.length;i++){
			str[i]= arr.get(i);
		}
		System.out.print(Arrays.toString(str));
		
		
	}
}