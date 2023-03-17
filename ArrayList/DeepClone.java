import java.util.*;
class Demo implements Cloneable{
	int b;
	Demo(){
		
	}
	Demo(int b){
		this.b=b;
	}
	public Demo clone()throws CloneNotSupportedException{
		Demo Obj = (Demo)super.clone();
		return Obj;
	}
	public String toString(){
		return "Demo[b = "+b+" ]";
	}
}
class First implements Cloneable{
	Demo d;
	int a;
	First(){
		
	}
	First(int a, Demo d){
		this.a = a;
		this.d = d;
		
	}
	public First clone()throws CloneNotSupportedException{
		First fobj = (First)super.clone();
		fobj.d = this.d.clone();
		return fobj;
		
		
	}
	public String toString(){
		return "First[a = "+a+" , "+d+" ]";
	}
}
class DeepClone{
	public static void main(String [] args)throws CloneNotSupportedException{
		Demo d1 = new Demo(10);
		First f1 = new First(5,d1);
		First f2 = f1.clone();
		f2.a=15;
		f2.d.b =25;
		System.out.println(f1);
		System.out.println(f2);
		
	}
}