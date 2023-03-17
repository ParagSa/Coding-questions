class BacktrackRecur{
	static void display(String str, String res){
		if(str.length() ==0){
			System.out.println(res);
		    return;
		}	
		for(int i = 0 ; i< str.length();i++){
			char r1 = str.charAt(i);
			//System.out.println(r1);
			String r2 = str.substring(0,i)+str.substring(i+1);
			//System.out.println(r2);
			display(r2,res+r1);
		}
          		
	}
	public static void main(String [] args){
		String s = "ABCD";
		display(s,"");
	}
}