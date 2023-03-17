import java.util.*;
class string11{
	public static void main(String [] args){
		String s1 = "Welcome";  //string pool ma jayega so same reference hoga s1 and s2
		String s2 = "Welcome";
		String s3 = new String("Welcome"); //heap ma jayega so same reference hoga s1 and s2
		String s4 = new String("Welcome");
		System.out.println(s1==s2); //true            
		System.out.println(s1==s3); //false                    shallow comparision
		System.out.println(s3==s4); //false
		
		System.out.println(s1.equals(s2));// true
		System.out.println(s3.equals(s4));//true         deep comparision
		System.out.println(s1.equals(s3));//true
		
		s1 = "Hellow";
		System.out.println(s1==s3);//false
		s1 = s1.concat(s3);// // string object are immutable we can not change string 
		System.out.println(s1);
		//s1 = s1+s3;// concat creatr new string all time and assiged to s1
		s1 = s1.concat("friends");
		System.out.println(s1);
		System.out.println(s1.charAt(6));
		char c [] = new char[10];
		s1.getChars(2,5,c,0);
		for(char ch : c){
			System.out.println(ch);
		}
		s1.getChars(6,10,c,1);  // to cut-out perticaluar elements of array and convert to char arry
		 // 5 means consider up to 4
		    for(char ch:c){
			   System.out.println(ch);
		    }
		 byte b[]=s1.getBytes();   // give a array of char's ascii value
		 for(byte by:b)
		 {
			 System.out.println(by);
		 }
		String s5="WElcoMe";
		String s6="welComE";
		System.out.println(s5.equals(s6));   // false case sensetative 
		System.out.println(s5.equalsIgnoreCase(s6));  //true ignore case 
		System.out.println(s5.equalsIgnoreCase("WelCome"));
		System.out.println(s1);
		char a[]=s1.toCharArray();
		for(char ch:a)
		{
			System.out.print(" "+ch);
		}
		System.out.println();
		String s7 = "parag Sane";
		System.out.println(s7.startsWith("parag"));// true check that string start with given string
		System.out.println(s7.endsWith("Sane"));//true check that string end with given string
		String s8="ABACDD";
		String s9="ABAACC";  
		System.out.println(s8.compareTo(s9));    //ABACDD
		System.out.println(s9.compareTo(s8)); //ABAACDD first diff at A & C so print ascii A - C=  -2	                                        //ABAACC  first diff at C & A so print ascii C - A=  +2
	    String s10="welcome";
		 //substring :- w ,e ,l ,c ,o ,m ,e , we ,el,lc,co,me,wel,wlc,lco,com,ome,welc,
           // elco,lcom,come,welco,elcom,lcome,welcom,elcome,welcome
		   // we can not jump any char we have to take in order for substring
		System.out.println(s10.substring(3)); // written sub string ,3 indicate sub string start form 3 index 
		System.out.println(s10.substring(3,5)); // written sub string ,3,5 indicate sub string start form 3 index  and end at 4(5-1)
		System.out.println("Hellow".substring(3,5));			// it is also ok
        
		
      String s11="Hellow ";
	  s11=s11.concat("Friends ").concat("welcome ");  // we can do that mutipal concat simultaneously // Hellow Friends welcome
	  System.out.println(s11); //Hellow  Friends welcome
	  System.out.println(s11.replace('H','h'));	  // repalce H with h //hellow  Friends welcome
	  System.out.println("Hellow".replace('H','h')); // ok //hellow
      System.out.println(s11.replaceFirst("Hellow","hi"));  // replace hellow with hi   // hi Friends welcome
	  System.out.println("Hellow Hellow".replaceFirst("Hellow","hi")); //only repalce first match check  // output hi Hellow
	  System.out.println("Hellow Hellow".replaceAll("Hellow","hi"));   // repalce all match   //hi hi

      System.out.println(s11.indexOf('w'));  // return index od char pass // return type is int  //5
	  System.out.println("hellwwow".indexOf('w')); // return first match index only // 4
	  System.out.println("hellwwow".indexOf("ww"));  // return substrinf startinf index in main string  //4
      System.out.println("hellwwow".indexOf("He"));   // if not match then returns -1  // -1
      System.out.println("hellwwow".indexOf("He",2));  // start cheking form index to 2 for matching // -1
      System.out.println(s11.contains("w"));   // return type boolean //true // only accept string not character
	  System.out.println("helow all".contains("w a"));  // true 
      String s12 ="";
	  System.out.println(s12.isEmpty());  // return type boolean // true 
	  String s13 ="  ";
	  System.out.println(s12.isEmpty());  // false // consder space as single character
	   System.out.println(String.join("---","friends","hi"));  // join all pass string with given string // static method // friends-hi  // first pass string is joining string
		String s22= "30/01/1999";
	    String la[]=s22.split("/",3);     // split string from the given string  ans store in character array
	    //String la[]=s22.split("/",2);
		for(String ch3: la){
			System.out.println(ch3);
		}
	  
	  
	  
////////////////StringBuffer//////////////////		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb.equals(sb1)); // false does shallow comparision
		System.out.println(sb.append(" PArag"));
		System.out.println(sb.insert(1,"tpoint"));
		System.out.println(sb.replace(1,4,"java")); //1 sa 3 tak replace kyuke 4 nai lega
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());// 21
		System.out.println(sb.append("1234567"));
		System.out.println(sb.capacity());// (21*2)+2=44 ma size increase gota hai.
       
		
/////////////////////StringBuilder///////////////		
		
		
		
	
	}
}