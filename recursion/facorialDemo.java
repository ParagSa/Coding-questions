class facorialDemo{
    ///static int factorial;
	static int fact(int n){
		//int factorial;
		if(n==1){
			return n;
		}
		else{
			return n*fact(n-1);
		}
		
	}
	
	public static void main(String [] args){
		System.out.println(fact(5));
	}
}