class Question12{
	public static void main(String [] args){
		String str = "Java is Great";
		String add = "%20";
		
		str = str.replaceAll("\\s",add);
		
		/*for(int i = 0; i <str.length();i++){
			
			if(str.charAt(i)==' '){
				str.substrin
			}
		
			
			
			
			System.out.print(str.charAt(i));
			
		}*/
		System.out.print(str);
	}
}