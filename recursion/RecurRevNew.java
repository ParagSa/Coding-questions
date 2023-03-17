class RecurRevNew{
    static int sum; 
	static void rev(int n){
		if(n==0){
			return;
		}
		//num=100;
		sum = sum*10+(n%10);
		rev(n/10);
		//num = num/10;
	}
	public static void main(String [] args){
		rev(123);
		System.out.println(sum);
	}
}