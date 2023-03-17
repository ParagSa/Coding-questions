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

	public String toString()
	{
		return "Student[roll = " + roll + ", name = "+name + ", marks = " + marks +", age = "+age+"]";
	}

	/*public int hashCode()
	{

		return (int) (roll+marks);
	}*/

	public boolean equals(Object ob)
	{
		Student s = (Student) ob;
		if(s == null)
			return false;

		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks && this.age==s.age)
			return true;
		else
			return false;

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
//comparator interface
class StudentrollComparator implements Comparator<Student>// comparator class 
{
	public int compare(Student s1, Student s2){
		if(s1.roll > s2.roll)
			return 1;
		if(s1.roll <s2.roll)
			return -1;
		
		return 0;
		
	}
}
class StudentageCompar implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		if(s1.age>s2.age)
			return 1;
		if(s1.age<s2.age)
			return -1;
		
		return 0;
	}
}
class ArrayListForUserDefinedObjects
{
	public static void display(List<Student> mylist)
	{
		Iterator<Student> it = mylist.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		List<Student> list1 = new ArrayList<Student>();

		Student s1 = new Student(1,"Rohit",75.0,23);
		list1.add(s1);

		list1.add(new Student(2,"Manish",65.0,26));
		list1.add(new Student(3,"Geeta",72.0,28));

		list1.add(new Student(4,"Mohit",69.0,30));

		//Iterating using Iterator
		System.out.println("List1 elements: ");
		display(list1);

		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(5,"Mahesh",56.0,32));
		list2.add(new Student(6,"Amisha",67.0,21));

		System.out.println("List2 elements: ");
		display(list2);
       /*
		//addAll() method.
		list1.addAll(list2);
		System.out.println("List1 elements after addAll list2 : ");
		display(list1);

		//contains() method
		boolean b = list1.contains(s1);
		System.out.println("list1.contains(s1) : " + b);

		
		Student s2 = new Student(1,"Rohit",75.0,23);

		b = list1.contains(s2);
		System.out.println("list1.contains(s2) : " + b);

		//remove() method
		list1.remove(s2);
		System.out.println("list1.remove(s2) : ");
		display(list1);

		b = list1.containsAll(list2);		//true;
		System.out.println("list1.containsAll(list2): " + b);
		
		
		
		Collections.sort(list1);
		System.out.println("after sort method");
		display(list1);
		Collections.sort(list1, new StudentrollComparator());
		System.out.println("after sort by roll method");
		display(list1);
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("after sort reverse method");
		display(list1);
		Collections.sort(list1, new StudentageCompar());
		System.out.println("after sort with age method");
		display(list1);*/
		
		//
		//Student s = list1.get(2);
		System.out.println("element at index 2");
		System.out.println(list1.get(2)); // get object at index 2
		
		list1.add(2,new Student(7,"mohan",87.8,21));
        display(list1);
		
		list1.addAll(3,list2);
		System.out.println("after addAll");
		display(list1);
	}
}
