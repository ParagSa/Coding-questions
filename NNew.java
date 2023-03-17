import java.util.*;

class NNew{
	public static void main(String args[]){
		int n = 5;
		for(int i = 1 ; i<=n;i++){
			for(int l= 5;l>=i;l--){
				System.out.print("*");
			}
			
			for(int k=2;k<2*i;k++)
			{
				System.out.print(" ");

			}
			for(int j= 5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i = 1 ; i<=n;i++){
			for(int l= 1;l<=i;l++){
				System.out.print("*");
			}
			
			for(int k=2*(n-i);k>0;k--)
			{
				System.out.print(" ");

			}
			for(int j= 1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
}