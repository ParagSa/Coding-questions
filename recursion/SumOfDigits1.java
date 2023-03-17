class SumOfDigits1{
	static int m;
	static int sum(int n){
		if(n<1){
			return n;
		}
		m = n%10;
		return m+sum(n/10);
	}
	public static void main(String [] args){
		System.out.println(sum(57578));
	}
}