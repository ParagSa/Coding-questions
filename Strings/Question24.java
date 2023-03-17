import java.util.*;

class Question24{
	static String[] sort(String str){
		String strArray [] = str.split(" ");
		for(int i = 0; i<strArray.length; i++){
			for(int j = i+1; j <strArray.length;j++){
				if(strArray[i].length()>strArray[j].length()){
					String swap = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = swap;
				}
			}
		}
		
		return strArray;
		
	}
	public static void main(String [] args){
		String str = "parag sane is fighter and optimistic";
		System.out.println(Arrays.toString(sort(str)));
	}
	
}	