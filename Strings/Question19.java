
class Question19{
	static char max;
	public static void main(String [] args){
		String str = "abbbbbbbbbbbbcddddeeeeeeeeeeeeeeeeeeeeeeee";
		char [] ch = str.toCharArray();
		int count;
		int count2=0;
	    
		for(int i = 0; i<ch.length; i++){
			count = 1;
			for(int j = i+1; j<ch.length;j++){
				if(ch[i]==ch[j] ){
					count++;
				}
			}
			if(count >count2){
				count2 = count;
				max = ch[i];
				
			}
			
			
		}
		System.out.println(max);
		
	}
}
