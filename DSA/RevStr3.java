class RevStr3{
	
	static void rev(String str){
		if(str.length() <=1 || str == null){
			System.out.println(str);
		}	
		else{
			System.out.print(str.charAt(str.length()-2));
			rev(str.substring(0,str.length()-1));
		}
          		
	}
	public static void main(String[] args){
		String s = "Parag is very tierd";
		rev(s);
	}
	
}