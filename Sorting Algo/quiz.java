class quiz{
	static int sum(int a,int b){
		if(b==0){
			return 0;
			
		}
		if(b==1){
			return a;
		}
		
		return a+sum(a,b-1);
	}
	public static void main(String [] args){
		System.out.println(sum(3,8));
	}
}