class recurexmp{
	static int count;
	static void cal(int n){
	   
		
		count++;
		int sum = n*count;
			System.out.println(sum);
		while(count<=10){
			cal(n);
			
		}
		
	}
	public static void main(String args[]){
	recurexmp.cal(3);
	}
}