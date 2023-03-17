class Question7{
	public static void main(String [] args){
		String str = "Programmingm";
		char [] ch = str.toCharArray();
		
		int count = 0;
		for(int i = 0; i<ch.length; i++){
			
			
				if(ch[i]=='m' && ch[i]!= ' '){
					count++;
					//ch[j]='0';
				}
		
		}
		System.out.println(count);
	}
}