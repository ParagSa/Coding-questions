import java.util.*;
class Student{
	int id;
	String name;
	double marks;
	Scanner sc = new Scanner(System.in);
	void printDetails(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		
	}
	
	void addDetails(){
		System.out.println("Enter student ID:");
		id = sc.nextInt();
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter Marks:");
		marks = sc.nextDouble();
		
	}
	
	void changeMarks(){
		System.out.println("Enter changed marks:");
		double marks = sc.nextDouble();

		
	}
	public boolean search(int idno){
		if(id.equals(idno)){
			printDetails();
			return(true);
			
		}
	    return (false);
		
	}
	
	
	
	
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of students do you want to input? ");
		int n = sc.nextInt();
		Student C[] = new Student[n];
		for(int i = 0;i < n;i++){
			C[i] = new Student();
			C[i].addDetails();
		}
		int ch;
		do{
			System.out.println("welcome to CDAC");
			System.out.println("1)ADD Details\n 2)Print details\n 3)change marks\n");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch(ch){
				case 1:
				System.out.print("Add students: ");
					   System.out.print("How many number of students do you want to input? ");
		               int n1 = sc.nextInt();
		               Student K[] = new Student[n1];
		               for(int i = 0;i < n1;i++){
			              K[i] = new Student();
			              K[i].addDetails();
		                }
				break;
				case 2:
				System.out.print("Enter id. you want to search: ");
				id= sc.nextInt();
				boolean found = false;  
                        for (int i = 0; i < n; i++) {  
                            found = C[i].printDetails(id);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed!student doesn't exist");
				        }
				break;
				case 3:
				 System.out.print("Enter student id. : ");  
                        id = sc.nextInt();  
                        found = false;  
                        for (int i = 0; i < n; i++) {  
                            found = C[i].search(id);  
                            if (found) {  
                                C[i].changeMarks();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }
                break;						
						
				
			}
		}while(ch!=3);
		
	}
}