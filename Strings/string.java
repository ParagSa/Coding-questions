class string{
	public static void main(String [] args){
		String str = "parago";
		char [] ch = str.toCharArray();
		int count = 0;
		for(int i = 0; i<ch.length; i++){
			if(ch[i]=='a'){
				count++;
				
			}
			if(ch[i]=='o'){
				count++;
			}
		}
		System.out.println(count);
	}
}