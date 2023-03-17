import java.util.*;
class diamond{
	public static void main(String [] args){	
		
		for(int i = 1; i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
			
			for(int j = 1;j<=2*(i-1);j++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=2;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
				
			}
			for(int j = 1;j<=(5-i)*2;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
	}
}