import java.util.*;
class Book{
	String title;
	static String author[] = new String[4];
	static Book b [] = new Book[4];
	int pages;
	float price;
	String publisher;
	static int a;
	int n;
	Book(){
		
	}
	Book(String ti,String au, int pa, float pric,String publi ){
		title = ti ;
		for(a = 0; a<4;a++){
			author[a] = au;
			
		}
		//3442title = ti ;
		//author = au;
		pages = pa;
		price = pric;
		publisher = publi;
		
	}
	void add(int k){
		
		//Library lib [] = new Library[4];
		//Book b [] = new Book[4];
		//String author[] = new String[4];
		int r = k;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < r; i++){
			System.out.println("Enter Book Name");
			String t = sc.next();
			System.out.println("Enter book Author name");
			String a = sc.next();
			System.out.println("Enter pages");
			int p = sc.nextInt();
			System.out.println("Enter price");
			float pri = sc.nextFloat();
			System.out.println("Enter publisher");
			String pub = sc.next();
			b[i] =  new Book(t,a, p, pri,pub);;
			
		}
		print();
		
		
	}
	
	void print(){
		System.out.println(title+" "+author[a]+" "+pages+" "+price+" "+publisher);
	}
}
class Library{
	
	//String lib []= new String[4];

	
	public static void main(String [] args){
		
        Book obj = new Book();
		//obj.add();
		//obj.print();
		Scanner sc = new Scanner(System.in);
		int n ;
		do{
			System.out.println("enter your 1 to add book"+"\n"+"enter your 2 to remove book");
			n = sc.nextInt();
			switch(n){
				case 1:
				System.out.println("enter the no of books to input.");
				int l = sc.nextInt();
				obj.add(l);
				
				break;
				
				
			}
		}
		while(n<2);
		
		//Library lib [] = new Library[4];
		/*Book b [] = new Book[4];
		//String author[] = new String[4];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++){
			System.out.println("Enter Book Name");
			String t = sc.next();
			System.out.println("Enter book Author name");
			String a = sc.next();
			System.out.println("Enter pages");
			int p = sc.nextInt();
			System.out.println("Enter price");
			float pri = sc.nextFloat();
			System.out.println("Enter publisher");
			String pub = sc.next();
			b[i] =  new Book(t,a, p, pri,pub);;
			
		}*/
	    
		/*for(int i = 0; i < l; i++){
			if(b[i]!=){
				
			}
		}*/
	
		
		
		/*Book b1 = new Book();
		b1.title= "Parag" ;
		b1.author[0] = "paru";
		b1.pages = 200;
		b1.price= 194.78f;
		b1.publisher="banarjee";
		b1.print(b1.author[0]);
		
		Book b2 = new Book();
		b2.title= "Sahil" ;
		b2.author[1] = "Sahil";
		b2.pages = 500;
		b2.price= 375.23f;
		b2.publisher="banarjee";
		b2.print();
		
		Book b3 = new Book();
		b3.title= "aniket" ;
		b3.author[2] = "ware";
		b3.pages = 600;
		b3.price= 643.12f;
		b3.publisher="banarjee";
		b3.print();
		
		Book b4 = new Book();
		b4.title= "ritesh" ;
		b4.author[3] = "pawar";
		b4.pages = 498;
		b4.price= 789.56f;
		b4.publisher="banarjee";
		b4.print();*/
		
		
		
	}
	
}