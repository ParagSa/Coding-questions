import java.util.*;
abstract class Employee{
	private int id;
	private String name;
	private int noOfYears;
	private double salary;
	abstract void getSalary(int basic);
	abstract void printSal();
	abstract void printDetails(); 
	// agar koi ek bhi abstract method child class ma override nai kia toh error deta hai
	/*CDACEmployee.java:22: error: regularEmp is not abstract and does not override abstract method printDetails() in Employee
class regularEmp extends Employee{
^
1 error*/
	void setdetails(int id, String name, int noOfYears){
		this.id = id;
		this.name = name;
		this.noOfYears = noOfYears;
	}
	int getid(){
		return id;
		//return noOfYears;
	}
	int getnoF(){
		return noOfYears;
	}
	String getName(){
		return name;
	}
	
	void setSal(double salary){
		this.salary = salary;
	}
	double getSal(){
		return salary;
	}
}
class regularEmp extends Employee{
	regularEmp(){
		
	}
	regularEmp(int id, String name, int noOfYears){
		setdetails(id, name,noOfYears);
		
	}
	void printDetails(){
		System.out.println(getid()+" "+getName()+" "+getnoF()+" years");
	}
	void getSalary(int basic){
		
		double extra = 0.70*basic;
		double salary =  basic +extra;
		setSal(salary);
		
	}
	void printSal(){
		System.out.println("Salary of regular employee "+getSal());
	}
	
	
	
}
abstract class contractEmp extends Employee{
	private int yearToWork;
	//void printDetails(){
		
	//}
	
	void setYtW(int yearToWork){
		this.yearToWork = yearToWork;
	}
	int getYtW(){
		return yearToWork;
	}
	
	
}
class CDACEmp extends contractEmp{
	CDACEmp(){
		
	}
	CDACEmp(int id, String name, int noOfYears, int yearToWork){
		setdetails(id, name,noOfYears);
		setYtW(5);
		 
	}
	void printDetails(){
		System.out.println(getid()+" "+getName()+" "+getnoF()+" years of service"+" "+getYtW()+" years of contract");
	}
	void getSalary(int basic){
		
		double extra = 0.50*basic;
		double salary =  basic +extra;
		setSal(salary);
		
	}
	void printSal(){
		System.out.println("Salary of  CDAC Contract based employee "+getSal());
	}
	
	
}
class ThirdpEmp extends contractEmp{
	ThirdpEmp(){
		
	}
	ThirdpEmp(int id, String name, int noOfYears, int yearToWork){
		setdetails(id, name,noOfYears);
		setYtW(4);
		 
	}
	void printDetails(){
		System.out.println(getid()+" "+getName()+" "+getnoF()+" years of service"+" "+getYtW()+" years of contract");
	}
	void getSalary(int basic){
		
		double extra = 0.20*basic;
		double salary =  basic +extra;
		setSal(salary);
		
	}
	void printSal(){
		System.out.println("Salary of  CDAC Contract based Third party employee "+getSal());
	}
	
}
class CDACEmployee{
	public static void main(String [] args){
		regularEmp r = new regularEmp(12,"parag",2);
		r.printDetails();
		r.getSalary(5000);
		r.printSal();
		
		CDACEmp cc = new CDACEmp(13,"ritesh",1,2);
		//cc.printDetails();
		cc.getSalary(9000);
		cc.printDetails();
		cc.printSal();
		
		ThirdpEmp T = new ThirdpEmp(00,"Aniket",2,3);
		//T.printDetails();
		T.getSalary(10000);
		T.printDetails();
		T.printSal();
	}
}