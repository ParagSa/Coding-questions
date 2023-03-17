import java.util.*;
import java.io.*; 
class Book{
	
	String title;
	String author ;//[] = new String[5];
	int pages;
	float price;
	String publisher;
	static Book b [] = new Book[5];
	
	static int a;
	int n;
	
	Book() {}
	
	Book(String ti,String au, int pa, float pric,String publi ){
		this.title = ti ;
		this.author = au;
		//for(a = 0; a<=5;a++){
		//}
		this.pages = pa;
		this.price = pric;
		this.publisher = publi;
		
	}
	void add(int k){
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<k; i++){
			System.out.println("Enter Book Name");
			this.title = sc.next();
			
			System.out.println("Enter book Author name");
			this.author = sc.next();
			
			System.out.println("Enter pages");
			this.pages = sc.nextInt();
			
			System.out.println("Enter price");
			this.price = sc.nextFloat();
			
			System.out.println("Enter publisher");
			this.publisher = sc.next();
			
			this.b[i] =  new Book(this.title, this.author, this.pages, this.price, this.publisher);
			
		}
		print();
		
	}
	
	@Override
	public String toString() {
		return this.title+" "+this.author+" "+this.pages+" "+this.price+" "+this.publisher;
	}
	
	public String remove(String bName) {
		for(int i=0; i<this.b.length; i++) {
		    if (bName.equals(b[i].title)) {
				System.out.println(b[i].title);
				return this.title+" "+this.author+" "+this.pages+" "+this.price+" "+this.publisher+" Removed";
			}
		}
		return "No Such Book exist";
	}	
	void print(){
		System.out.println(Arrays.toString(this.b));
	    LibraryYash.main(null);
	}
}

public class LibraryYash{
	
	public static void main(String [] args) {
		
        Book obj = new Book();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your 1 to add book"+"\n"+"enter your 2 to remove book");
		int n = sc.nextInt();
		
		if(n == 1){
			System.out.println("enter the no of books to input.");
			int l = sc.nextInt();
			obj.add(l);
		} else if(n == 2) {
			System.out.println("enter the name of a book you want to remove from the list below.");
			System.out.println(Arrays.toString(Book.b));
			String bName = sc.next();
			//System.out.println(obj.remove(bName));
			obj.remove(bName);
		}
		
	}
	
}