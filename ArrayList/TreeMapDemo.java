import java.util.*;

class Student implements Comparable<Student>
{
	int age;
	double marks;
	int roll;
	String name;
	Student(){
		
	}
	Student(int roll, String name,double marks,int age){
		this.name = name;
		this.age= age;
		this.roll= roll;
		this.marks = marks;
	}
	public void printNameMarks(){
		System.out.println("Name = " + name + " Marks = " + marks);
	}
	public String toString(){
		return "Student[roll = " + roll + ", name = "+name + ", marks = " + marks + ", age = "+ age + "]";
	}
	public int hashCode(){
		return (int)(age+marks+roll);
	}
	public boolean equals(Object ob){
		Student s = (Student)ob;
		if(s==null)
			return false;
		if(this.age==s.age && this.marks == s.marks &&this.roll== s.roll && this.name.equals(s.name))
			return true;
		else
			return false;	
	}
	public int compareTo(Student s){
		if(this.marks>s.marks)
			return 1;
		if(this.marks<s.marks)
			return -1;
		
		return 0;
	}
}
class TreeMapDemo{
	public static void main(String [] args){
		TreeMap<Integer,Student> map1 = new TreeMap<Integer,Student>();
		Student s1 = new Student(2,"Rohit",65.0,21);
		Student s2 = new Student(3,"Mukesh",56.0,23);
		
		//Add element to map
		map1.put(2,s1);
		map1.put(3,s2);

		map1.put(1,new Student(1,"Geeta",73.0,20));
		map1.put(4,new Student(4,"Manisha",63.0,21));

		//Retrieve element from map
		Student s = map1.get(3);
		System.out.println(s);
		//remove(key) -- removes the element from the map with the passed key
		map1.remove(3);
		//Iterate using entrySet();
		Set<Map.Entry<Integer,Student>> entryset1 = map1.entrySet();
		System.out.println("Map elements : " );
		for(Map.Entry<Integer,Student> entry : entryset1)
		{
			System.out.println(entry);
		}
		

	}
}