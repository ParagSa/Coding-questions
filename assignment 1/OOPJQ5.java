import java.util.*;
class Student{
	private String n;
	private int p;
	private int c;
	private int m;
	
	void setVal(String nam,int p, int c,int m){
		n= nam;
		this.p = p;
		this.c = c;
		this.m = m;
		
	}
	double avgMark(){
		double avg = (p+c+m)/3;
		return avg;
		
	}
	void print(){
		System.out.println("Name = "+n);
		System.out.println("Marks in Physics "+p);
		System.out.println("Marks in Chemistry "+c);
		System.out.println("Marks in Maths "+m);
		System.out.println("Total marks "+(p+m+c));
		
	}
	
}
class School{
	public static void main(String[]args){
		Student s1 = new Student();
		s1.setVal("parag",75,85,90);
		System.out.println("Average Marks are "+s1.avgMark());
		s1.print();
	}
}