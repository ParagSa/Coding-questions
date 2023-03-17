import java.util.*;
class perfectNo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int [] arr = new int[a];
		int j = 0;
		
		for(int i = 1;i<a;i++){
			if(a%i==0){
				
				arr[j]=i;
				j++;
				
			}
			
		}
		int sum =0;
		for(int k =0; k<arr.length;k++){
			sum+=arr[k];
			
			
			
		}
		if(sum==a){
			System.out.println("number is perfectNo");
			
		}
		
	}
	
	
}	