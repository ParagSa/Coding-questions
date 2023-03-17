import java.util.*;
class EmpSal{
	public static void main(String args[]){
		double HRA;
	    double DA;
		double GS;
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		if(sal<10000){
			HRA = 0.10*sal;
			DA  = 0.90*sal;
			
			GS = sal + HRA +DA;
			System.out.println(GS);
			
		}else{
			HRA = 2000;
			DA  = 0.98*sal;
			
			GS = sal + HRA +DA;
			System.out.println(GS);
		}
		
	}
}
	