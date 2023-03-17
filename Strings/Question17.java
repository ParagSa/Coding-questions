class Question17{
	public static void main(String[] args){
		String str1 = "abc";
		String str2 = "def";
		String str3 = "bdeafe";
		String og = str1.concat(str2);
		//System.out.println(og);
		int count = 0;
		char [] ch = og.toCharArray();
		char [] ch2 = str3.toCharArray();
		for(int i = 0; i<ch.length;i++){
			for(int j = 0; j<ch.length;j++){
				if(ch[i]==ch2[j]){
					count++;
					ch2[j]='0';
				}
			}
		if(count == ch.length ){//& ch2[i]!='0'){
				System.out.println("valid Schuffle");
			}
		}
		 if(count <ch.length){
				System.out.println("Not valid Schuffle");
			}
	}
}