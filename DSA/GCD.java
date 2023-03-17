import java.util.*;
class GCD{
	static double  Gcd(int a,int b ){
		if(b!=0){
			return Gcd(b,a%b);
		}else{
			return a;
		}
	}
	public static void main(String args[]){
		System.out.println(Gcd(8,12));
	}
}