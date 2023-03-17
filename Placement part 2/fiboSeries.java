class fiboSeries
{
	public static void main(String []args)
	{
		int num = 9;
		fibo(num);
		
		
	}
	public static void fibo(int num)
	{
		int a =0; 
		int b = 1;
		int c;
		System.out.print(a+" "+b);
		
		for(int i = 2; i< num; i++){
			
			c= a+b;
			System.out.print(" "+c);
			a = b;
			b= c;
			
		}
		
		
	}
}