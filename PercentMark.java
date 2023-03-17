import java.util.*;

class PercentMark{
	public static void main(String args[]){
		float sum = 0;
		float n;
		float t = 500;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=5;i++){
			n = sc.nextFloat();
			sum = sum + n;
		}
		float per = (sum/t)*100;
		System.out.println(per);
		
	}
}