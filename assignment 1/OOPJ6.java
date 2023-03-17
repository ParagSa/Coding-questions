import java.util.*;
class Box{
	private int h;
	private int w;
	private int b;
	int getVol(){
		int vol = h*w*b;
		return vol;
	}
	int getSa(){
		int sa = 2*((h*b)+(h*w)+(b*w));
		return sa;
		
	}
	Box(){
		
	}
	Box(int h , int w, int b){
		this.h = h;
		this.w= w;
		this.b = b;
		
	}
}
class mensu{
	public static void main(String[]args){
		Box b1 = new Box(12,6,13);
		System.out.println("Volume "+b1.getVol());
		System.out.println("Surface Area "+b1.getSa());
	}
}