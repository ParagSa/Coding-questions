import java.util.*;
class Cricle{
	int area(int r){
		int a = (22/7)*r*r;
		return a;
	}
	int circum(int n){
		int c = 2*(22/7)*n;
		return c;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		Cricle c1 = new Cricle();
		System.out.println(c1.area(rad));
		System.out.println(c1.circum(rad));
		
	}
}