import java.util.*;
class Customexception extends Exception{
	public Customexception(){
		super("Default exception message");
	}
	public Customexception(int age){
		super("Not eligibe for Voting "+age);
	}
}
class DemoHomework{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		//int age = sc.nextInt();
		System.out.println("Program started execution enter age");
		int age = sc.nextInt();
		
	    try{
			if(age < 18){
				//throw new Customexception();
				throw new Customexception(age);
			}else{
				System.out.println("You are eligible to vote "+age);
			}
				
	    }
		catch(Customexception e){
			System.out.println("inside catch "+e.getMessage());
		}
		//finally{
			//System.out.println("You are eligible to vote "+age);
		//}
		
	}
}