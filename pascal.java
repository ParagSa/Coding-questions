import java.util.*;

class pascal{
	static int facto(int n){
		int f;
		for(f=1;n>1;f--){
			f*=n;
			
		}
		return f;
	}
	static int ncr(int n, int r){
		return facto(n)/(facto(n-r)*facto(r));
	}
	public static void main(String [] args){
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i= 0;i<=n;i++){
			for(j=0;j<=n-i;j++){
				System.out.print(" ");
				
			}
			for(j=0;j<=i;j++){
				System.out.print(" "+ncr(i,j));
			}
			System.out.println();
		}
		
		
	}
}

