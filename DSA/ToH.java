class ToH{
	static void Hon(int n, char s,char inter,char d){
		if(n==1){
			System.out.println(s+" To "+d);
		
		}else{
			Hon(n-1,s,d,inter);
			System.out.println(s+" To "+d);
			Hon(n-1,inter,s,d);
			
		}
	}
	public static void main(String args[]){
		int n = 3;
		Hon(n,'A','B','C');
	}	
	
}