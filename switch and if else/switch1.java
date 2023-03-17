import java.util.*;

class switch1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number ");
		int num1 = sc.nextInt();
		System.out.println("enter second number ");
		int num2 = sc.nextInt();
		System.out.println("press 1 for addition"); 
		System.out.println("press 2 for sub");
		System.out.println("press 3 for multiply");
		System.out.println("press 4 for divide");
	    System.out.println("press 5 for remainder");
		int n = sc.nextInt();
		
		
		
		switch(n){
			case 1:
			System.out.println(num1+num2);
			break;
			case 2:
			System.out.println(num1-num2);
			break;
			case 3:
			System.out.println(num1*num2);
			break;
			case 4:
			System.out.println(num1/num2);
			break;
			case 5:
			System.out.println(num1%num2);
			break;
			default:
			System.out.println("invalid number");
			break;
			
			
		}
		
		
		
		
	}
}