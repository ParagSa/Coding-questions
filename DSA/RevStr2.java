class RevStr2{
	static String rev(String str){
		if(str.isEmpty()){
			return str;
		}else{
			return rev(str.substring(1))+str.charAt(0) ;
			
		}
	}
	public static void main(String[] args){
		//RevStr2 r1 = new RevStr2();
		//String s = r1.rev("Parag");
		String s = "Parag is very tierd";
		
		//String ans = rev(s);
		System.out.print(rev(s));
	}
	
}