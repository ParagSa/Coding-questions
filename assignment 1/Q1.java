import java.util.*;
abstract class Publication{
	int noOfPages;
	int price;
	String publisherName;
}
class Book extends Publication{
	Book(){
		
	}
	Book(int noOfPages,int price,String publisherName){
		this.noOfPages=noOfPages;
		this.price = price;
		this.publisherName=publisherName;
	}
	void print(){
		System.out.println(noOfPages+" "+price+" "+publisherName);
	}
	
}
class Journal extends Publication{
	Journal(){
		
	}
	Journal(int noOfPages,int price,String publisherName){
		this.noOfPages=noOfPages;
		this.price = price;
		this.publisherName=publisherName;
	}
	void print(){
		System.out.println(noOfPages+" "+price+" "+publisherName);
	}
	
}
class library22{
	public static void main(String[]args){
		System.out.println("welcome to CDAC Library");
		int n;
		//System.out.println("press 1 to enter details Book and press 2 to enter the details of Journal");
		Book b[] = new Book[4];
		Journal j[] = new Journal[4];
		Scanner sc = new Scanner(System.in);
		//n = sc.nextInt();
		do{
			System.out.println("press 1 to enter details Book and press 2 to enter the details of Journal");
		    //Book b[] = new Book[4];
		    //Journal j[] = new Journal[4];
			n = sc.nextInt();
			switch(n){
			case 1:
			//Book b[] = new Book[2];
			System.out.println("enter the numbers of Book details you want to input");
			int l = sc.nextInt();
			System.out.println("enter the Book details");
			for(int i = 0;i<l;i++){
				System.out.println("enter the number of pages");
				int pages = sc.nextInt();
				System.out.println("enter the price of book");
				int price = sc.nextInt();
				System.out.println("enter the publisher name");
				String name = sc.next();
				b[i] = new Book(pages,price,name);
				//b.print();
				
			}
			for(int i = 0;i<l;i++){
				b[i].print();
			}
			//b[0].print();
			//System.out.println(b[0]);
			
			break;
			case 2:
			//Journal j[] = new Journal[1];
			System.out.println("enter the numbers of Journal details you want to input");
			int m = sc.nextInt();
			System.out.println("enter the Journal details");
			for(int i = 0;i<2;i++){
				System.out.println("enter the number of pages");
				int pages = sc.nextInt();
				System.out.println("enter the price of Journal");
				int price = sc.nextInt();
				System.out.println("enter the publisher name");
				String name = sc.next();
				j[i] = new Journal(pages,price,name);
				
			}
			for(int i = 0;i<m;i++){
				j[i].print();
			}
			break;
			/*case 3:
			for(int i = 0;i<4;i++){
				b[i].print();
			}
			break;*/
			default:
			System.out.println("enter valid input");
		}
			
		}
		while(n<4);
		
		
	}
}