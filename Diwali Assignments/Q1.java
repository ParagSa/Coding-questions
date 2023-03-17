import java.util.*;
class Q1{
	public static void main(String args[]){
		for(int i= 1; i<=5;i++){
			
			for(int k= i ; k<5;k++){
				System.out.print(" ");
			}
			for(int j = 1; j<=(2*i -1);j++){
				if(j ==1|| i==5|| j == (2*i-1)){
					System.out.print("*");
				}else{
					 System.out.print(" ");
				}
				
			}
				
			System.out.println("");
	
			
			
		}
		
		//System.out.println();
			
	}
}