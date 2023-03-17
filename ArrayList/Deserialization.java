import java.util.*;
import java.io.*;
class Demo implements Serializable{
	int a;
	String s;
	double d;
	Demo(){
		
	}
	Demo(int a, String s, double d){
		this.a= a;
		this.s = s;
		this.d = d;
	}
	public String toString(){
		return "Demo [a = "+a+", s = "+s+", d = "+d+"]";
	}
}
class Deserialization{
	public static void main(String []args)throws IOException,ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("target.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Demo d = (Demo)ois.readObject();
		//ois.flush();
		ois.close();
		
		System.out.println("Object deseriaslized from secondary storage");
		
		System.out.println(d);
	}
}