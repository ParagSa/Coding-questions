import java.util.*;

class switch2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number ");
		int num1 = sc.nextInt();
		System.out.println("enter second number ");
		int num2 = sc.nextInt();
		System.out.println("press 1.1 for addition"); 
		System.out.println("press 1.2 for sub");
		System.out.println("press 1.3 for multiply");
		System.out.println("press 1.4 for divide");
	    System.out.println("press 1.5 for remainder");
		String n = sc.next();
		
		
		
		switch(n){
			case "1.1":
			System.out.println(num1+num2);
			break;
			case "1.2":
			System.out.println(num1-num2);
			break;
			case "1.3":
			System.out.println(num1*num2);
			break;
			case "1.4":
			System.out.println(num1/num2);
			break;
			case "1.5":
			System.out.println(num1%num2);
			break;
			default:
			System.out.println("invalid number");
			break;
			
			
		}
		
		
		
		
	}
}