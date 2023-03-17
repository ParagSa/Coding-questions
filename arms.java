import java.util.*;
class arms{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
        int num = 	sc.nextInt();
		int count =0;
		int k = num;
		int sum =0;
		while(num!=0){
			num = num/10;
			count++;
			
		}
		num =k;
 		while(num!=0){
			int m = num%10;
		    sum = sum + (int)Math.pow(m,count);
			num = num/10;
		}
		if(k == sum)
			System.out.println("armstrong");
		else
			System.out.println("NOt");
	}
}