import java.util.Scanner;
class evenodd{
	public static void main(String [] args){
		int n = 1;
		Scanner sc = new Scanner(System.in);
		while(n!=0){
			int num = sc.nextInt();
		if(num%2==0){
			System.out.println(num+" is a even number.");
		}else{
			System.out.println(num+" is a odd number.");
		}
		
		}
	}
}