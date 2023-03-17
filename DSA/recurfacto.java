class recurfacto{
	//static int m;
	static int facto(int n){
		System.out.println(n);
		if(n<=1){
			return n;
		}
		else{
			//facto(m-1);
			//return m;
			return n*facto(n-1);
			//facto(m-1);
		}
		//System.out.println(n);

		
	}
	
	public static void main(String args[]){
		System.out.println(facto(5));
	
	}
}