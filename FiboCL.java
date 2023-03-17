import java.util.*;
class FiboCL{
	public static void main(String args[]){
		int n1 =0,n3;
		int n2 =1;
		int num = Integer.parseInt(args[0]);
		System.out.print(n1+" "+n2);
		for(int i =1;i<num;i++){
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2 = n3;
			
		} 
		
		
	}
}