import java.util.*;

class switchmarks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int m= sc.nextInt();
		
		int n=(m>85 && m<=100)?(1):(m>59 && m<86)? 2:(m>49 && m<61)? 3:(m>39 && m<51)? 4 : (m>=0 && m<40)?5:6;
		
		
		
		switch(n){
			case 1:
			System.out.println("dist");
			break;
			case 2:
			System.out.println("First");
			break;
			case 3:
			System.out.println("Second");
			break;
			case 4:
			System.out.println("Third");
			break;
			case 5:
			System.out.println("Fail");
			break;
			default:
			System.out.println("invalid percentage");
			break;
			
			
		}
		
		
		
		
	}
}