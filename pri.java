import java.util.*;
class pri{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int count=0;
		int num = sc.nextInt();
		for(int i = 2;i<num;i++){
			
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
		
		
	}
}						