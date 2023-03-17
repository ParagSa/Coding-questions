import java.util.*;
class pfactors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count;
		for(int i = 1;i<=num;i++){
			if(num%i==0){
				count =0;
				for(int j =2;j<=i/2;j++){
					if(i%j==0){
						count++;
						break;
					}
				}
				if(count==0 && i!=1){
					System.out.println(i);
				}
			}
		}
		
	}
}