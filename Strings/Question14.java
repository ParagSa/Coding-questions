class Question14{
	static void rev(String str){
		if(str.length()==0){
			System.out.println(str);
		}else{
			System.out.print(str.charAt(str.length()-1));
			rev(str.substring(0,str.length()-1));
		}
		
	}
	public static void main(String [] args){
		String str = "ABC";
		//String ans = "";
		rev(str);
		
	}
}