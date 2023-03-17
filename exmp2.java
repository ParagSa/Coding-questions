import java.util.*;

class Contactdetails{
	String email;
	String No;
	Contactdetails(){}
	Contactdetails(String email, String No){
		this.email = email;
		this.No = No;
	}
}
class Employee{
	String Name;
	int Id;
	Contactdetails cd ;
	Employee(){
		//cd = new Contactdetails();
		
	}
	Employee(String Name,int Id, String e, String N ){
		cd = new Contactdetails();
		this.Name = Name;
		this.Id = Id;
		cd.email = e;
		cd.No = N;
		
		
		
	}
	void printD(){
		System.out.print(Name+" "+Id+" "+cd.email+" "+cd.No);
	}
	
}
class exmp2{
	public static void main(String [] args){
		Employee emp1 = new Employee ("parag",21,"parag@gmail.com","902838320");
		emp1.printD();
	}
}