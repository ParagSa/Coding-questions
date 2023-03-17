import java.util.*;
enum day{Mon, Tue, Wed, Thur, Fri, Sat, Sun};
class week{
	public static void main(String args[]){
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		day days =day.valueof(str);
	
		switch(day){
			case Mon:
			System.out.println("today is monday");
			break;
			case Tue:
			System.out.println("today is Tuesday");
			break;
			case Wed:
			System.out.println("today is Wednesday");
			break;
			case Thur:
			System.out.println("today is Thursday");
			break;
			case Fri:
			System.out.println("today is Friday");
			break;
			case Sat:
			System.out.println("today is Saturday");
			break;
			case Sun:
			System.out.println("today is Sunday");
			break;
			default:
			System.out.println("invalid day");
			break;
			
			
		}
		
		
		
		
	}
}