import java.util.*;
class fibo{
	public static void main(String []args){
		int n1=0,n2=1,n3;
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println(n1+" "+n2);
		for(int i =1;i<count;++i){
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2=n3;
			
			
			
		}
	}
}