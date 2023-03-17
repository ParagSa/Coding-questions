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
class SerializationDemo{
	public static void main(String []args)throws IOException{
		Demo d1 = new Demo(11,"Parag",11.77);
		FileOutputStream fos = new FileOutputStream("target.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.flush();
		oos.close();
		System.out.println("Object State "+d1);
		System.out.println("permanent stored");
		
		
	}
}