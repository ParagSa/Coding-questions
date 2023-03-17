import java.util.*;
interface MyInterface<T>{
	void Fun(T a);
}
public class GenInter<T> implements MyInterface<T>{
	
		
	void Fun(T a){
		System.out.println(a);
			
	}	
	
}
class MyGenInter{
	public static void main(String args[])
	{
		GenInter<Integer> k = new GenInter<Integer>();
		k.Fun(10);
	}
	
}