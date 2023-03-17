import java.util.*;
import java.io.*;
class ConsoleRead{
	public static void main(String []args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Number");
		String strIn = br.readLine(); 
		int num = Integer.parseInt(strIn);
		System.out.println("Enter Double Number");
         strIn = br.readLine(); 
		double dval = Double.parseDouble(strIn);
		
		System.out.println("Enter Name");
		strIn = br.readLine(); 
	    String name = strIn;
		System.out.println(num);
		System.out.println(dval);
		System.out.println(name);
		
	}
}