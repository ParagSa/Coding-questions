import java.util.*;
class SI{
	float sum(int l,float m,int n){
		float total = (l*m*n)/100;
		return total;
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		float r = sc.nextFloat();
		int t = sc.nextInt();
		SI e = new SI();
		System.out.println(e.sum(p,r,t));
		
	}
}