import java.util.*;

class switch3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number ");
		int num1 = sc.nextInt();
		System.out.println("enter second number ");
		int num2 = sc.nextInt();
		System.out.println("press monday for addition"); 
		System.out.println("press tuesday for sub");
		System.out.println("press wednesday for multiply");
		System.out.println("press thursday for divide");
	    System.out.println("press friday for remainder");
		String n = sc.next();
		
		
		
		switch(n){
			case "monday":
			System.out.println(num1+num2);
			break;
			case "tueday":
			System.out.println(num1-num2);
			break;
			case "wednesday":
			System.out.println(num1*num2);
			break;
			case "thursday":
			System.out.println(num1/num2);
			break;
			case "friday":
			System.out.println(num1%num2);
			break;
			default:
			System.out.println("invalid number");
			break;
			
			
		}
		
		
		
		
	}
}