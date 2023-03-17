import java.util.Scanner;
class palindrome{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while(num>0){
			int rem = num%10;
			sum =(sum*10)+rem;
			num=num/10;
	    }
		if(temp==sum){
			System.out.println("Palindrome number.");
		}
		else
			System.out.println("not a palindrome number.");
			
			
	}
}