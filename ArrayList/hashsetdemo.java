
import java.util.*;

class Student implements Comparable<Student> // comparable is a generic interface therefore object dena padega
// comparable compare objects based on one field
// if we need to comapre more than two things then comparator is used
{
	int roll;
	String name;
	double marks;
	int age;
        
	Student()
	{
	}

	Student(int roll, String name, double marks , int age)
	{
		this.roll = roll;
		this.name = name;
		this. marks = marks;
		this.age = age;
	}
	public void printNameAndMarks()
	{
		System.out.println("Name = " + name + " Marks = " + marks);
	}


	public String toString()
	{
		return "Student[roll = " + roll + ", name = "+name + ", marks = " + marks +", age = "+age+"]";
	}

	
	public int compareTo(Student s){
		//comparision on marks
		if(this.marks > s.marks)
			return 1;
		if(this.marks<s.marks)
			return -1;
		
		return 0;
		//return this.name.compareTo(s.name);
	}
}

class hashsetdemo
{
	
	public static void display(Set<Student> mySet)
	{
		Iterator<Student> it = mySet.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		Set<Student> set1 = new TreeSet<Student>();

		Student s1 = new Student(1,"Rohit",75.0,23);
		set1.add(s1);

		set1.add(new Student(2,"Manish",65.0,26));
		set1.add(new Student(3,"Geeta",72.0,28));

		set1.add(new Student(4,"Mohit",69.0,30));

		//Iterating using Iterator
		System.out.println("List1 elements: ");
		display(set1);

		Set<Student> set2 = new TreeSet<Student>();
		set2.add(new Student(5,"Mahesh",56.0,32));
		set2.add(new Student(6,"Amisha",67.0,21));

		System.out.println("List2 elements: ");
		display(set2);
        
	}
}
