class fiborecur{
	//static int count;
	static long fibo(int n){
		
		if(n<=1){
			return n;
			
		}else{
			return fibo(n-1)+fibo(n-2);
		}
			///count++;
			
		
		
	}
	public static void main(String args[]){
		/*for(int i = 0; i<=50;i++){
			System.out.println(fibo(i));
		}*/
		System.out.println(fibo (7));
		
	
	}
}