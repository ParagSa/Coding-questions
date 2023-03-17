import java.util.*;

class Room{
	private int l;
	private int b;
	private int h;
	
	void setVal(int a,int b,int c){
	    l = a;
		this.b = b;
		h = c;
	}
	void vol(){
		int volume = l*b*h;
		System.out.println(volume);
	}
	
	
}
class RoomDemo{
	public static void main(String [] args){
		Room r1 = new Room();
		r1.setVal(2,3,5);
		r1.vol();
	}
}