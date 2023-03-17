import java.util.Scanner;
class lcm{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd =1;
		for(int i = 1;i<=num1&&i<=num2;i++){
			if(num1%i==0&&num2%i==0){
				if(i>gcd)
					gcd = i;
	
			    
				
			}
			
		}
		//System.out.println("gcd of "+num1+" and "+num2+" is "+gcd);
		int lcm = (num1*num2)/gcd;
		System.out.println("lcm of "+num1+" and "+num2+" is "+lcm);
		
	}
}