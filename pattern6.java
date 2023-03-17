import java.util.*;
class pattern6{
	public static void main(String[] args){
		for(int i= 1;i<=9;i++){
			for(int j =0;j<i;j++){
				System.out.print(" ");
			}
			for(int j=9 ;j>=i;j--){
				System.out.print("* ");
	        }
			
			System.out.println("");
		}
	}
}