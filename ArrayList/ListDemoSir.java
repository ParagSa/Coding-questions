import java.util.*;

class Shape{
	void area(){
		System.out.println("Inside Shape");
	}
	
}
class Triangle extends Shape{
	void area(){
		System.out.println("Inside Triangle");
	}
	
	
}
class Circle extends Shape{
	void area(){
		System.out.println("Inside circle");
	}
	
}
class ListDemoSir{
	public static void main(String []args){
		List<Shape> list1 = new ArrayList<>();
		list1.add(new Shape());
		list1.add(new Triangle());
		list1.add(new Circle());
		//list1.add(new shape());
		Shape s = list1.get(0);
		s.area();
		
	}
	
}