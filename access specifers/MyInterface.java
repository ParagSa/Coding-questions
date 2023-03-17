import java.util.*;
interface Shape
{
	//double area;
	void calArea();
	
	
	void printArea();
}

class Rectangle implements Shape
{   
    double area;
	double len;
	double bre;
	Rectangle()
	{
		
	}
	Rectangle(double len, double bre){
		this.len = len;
		this.bre = bre;
	}
	public void calArea()
	{
		area = len*bre;
	}
	public void printArea(){
		System.out.println(area);
	}
	
}

class Square implements Shape
{
	double area;
	double side;
	Square()
	{
		
	}
	Square(double side){
		this.side = side;
	}
	public void calArea()
	{
		area = side*side;
	}
	public void printArea(){
		System.out.println(area);
	}
	
}

class Circle implements Shape
{
	double area;
	double radius;
	
	Circle()
	{
	
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void calArea()
	{
		area = 3.14 * radius * radius;
	}
	public void printArea(){
		System.out.println(area);
	}
}
class MyInterface
{
	public static void main(String args[])
	{
		Shape s[];
		s = new Shape[3];
		
		s[0] = new Rectangle(4.0,5.0);
		s[1] = new Square(8.0);
		s[2] = new Circle(5.0);
		
		for(int i = 0; i < 3; i++)
		{
			s[i].calArea();	//Same statement is calling different methods of different class. 					//Polymorphic behaviour.
			s[i].printArea();
		}
		
	}
}