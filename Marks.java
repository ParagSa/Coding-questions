import java.util.*;
class Marks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n =(num>85 && num<=100)?(1):(num>59 && num<=84)?(2):(num>39 && num<=59)?(3):(num>34)?(4):(5);
		switch(n){
		case 1:
		System.out.print("distiction");
		break;
		case 2:
		System.out.print("first class");
		break;
		case 3:
		System.out.print("second class");
		break;
		case 4:
		System.out.print("pass");
		break;
		case 5:
		System.out.print("fail");
		break;
		default:
		System.out.print("Invalid input");
		break;
		
		}
		
		
	}
		
}