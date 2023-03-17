import java.util.*;
class Binarytodeci{
	public static void main(String []args){
		int count =0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		while(num!=0){
			int n = num%10;
			//count++;
			if(n==1){
				sum = sum +(int)Math.pow(2,count);
				
			}
			count++;
			num = num/10;
			
		}
		System.out.println(sum);
	}
}