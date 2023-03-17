import java.util.*;
class ArrayListDemo{
	static void display(List<String> list){
		for(String s: list){
			System.out.println(s);
		}
	}
	public static void main(String args[]){
		List <String> list1 = new ArrayList<String>();
		list1.add("parag");
		list1.add("rushabh");
		list1.add("ritesh");
		list1.add("aniket");
		list1.add("atreya");
		list1.add("sahil");
		display(list1);
		
		List <String> list2 = new ArrayList<String>();
		list2.add("virag");
		list2.add("parag");
		list2.add("aniket");
		list2.add("karan");
		list2.add("jitesh");
		display(list2);
		
		List <String> list3 = new ArrayList<String>();
		list3.add("yash");
		list3.add("omkar");
		list3.add("karan");
		list3.add("raman");
		list3.add("prasad");
		display(list3);
		
		//list1.addAll(list2);
		//System.out.println("List1 elements after adding List2 elements:");
		//display(list1);
		
		//list1.clear();
		//System.out.println("List1 elements after list1.clear():");
		//display(list1);
		
		boolean b;
		b = list1.contains("parag");
		System.out.println("list1.contains(\"parag\") : " + b);
		
		b = list1.containsAll(list2);
		System.out.println("list1.containsAll(list2) : " + b);
		
		b = list1.isEmpty();
		System.out.println("list1.isEmpty() : " + b);
		
		//list1.removeAll("parag");// error sirf removeAll method ma object he pass karr sakte hai
		System.out.println("List1 elements after removing parag : ");
		display(list1);// ek parag reh jayega joh list 2 ke sath aya tha jab addAll kia tha
		System.out.println("List2 elements after removing parag from list1: ");
		display(list2);// yaha bhi parag rehaga
		
		//list1.removeAll(list2);// list 2 ke elemnts ke sath list 1 ma joh common elements he voh bhi niklega
		System.out.println("List1 elements after removing all list2 : ");
		display(list1);
		
		System.out.println("List2 elements : ");
		display(list2);// list ke saare elements rehaga even after removing all elements from list1 
		
		//list1.retainAll(list2);// display common elements and if the elements are present twice in the list then it will be printed twice
		//System.out.println("List1 elements after retaining all list3 : ");
		//display(list1);
		
		int r = list1.size();
		System.out.println("list1.size() : " + r);
		
		
		Object [] arr = list1.toArray();
		System.out.println("Iterating arr after list1.toArray() : ");
		for(Object ob : arr)
		{
			System.out.println(ob);
		}
		
		
	}
	
}