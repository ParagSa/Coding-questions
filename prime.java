import java.util.*;

class prime{
	public static void main(String [] args){
		int count;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    for(int i = 1 ; i<=num;i++){
			count =0;
			for(int j =2; j<= i/2;j++){
				if(i%j==0){
					count++;
					break;
					
				}
			}
			if(count==0&& i!=1){
				System.out.println(i);
			}
			
		}
	}
	
}