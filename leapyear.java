import java.util.Scanner;

class leapyear{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n!=0){
			int year = sc.nextInt();
			int num = year%100;
			if(num%2==0){
				System.out.println(year+" is a leap year.");
			}else{
				System.out.println(year+" is not a leap year.");
			}
			
		}
		
		
	}
}