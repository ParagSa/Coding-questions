import java.util.*;
class solarsys{
	    double weight(double i){
		System.out.println("To know your weight on this planet enter your weight in kgs. on earth.");
		Scanner sc = new Scanner(System.in);
		double j = sc.nextDouble(); 
		return i*j;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String ch;
		solarsys obj = new solarsys();
		
		
		do{
			System.out.println(">>>>>>>>>>>>>>>Welcome to the World of CDAC Planetarium.<<<<<<<<<<<<<<<");
		    System.out.println("Please enter the name of the planet you want to visit and gather info.");
		    ch = sc.next();
		    switch(ch){
				case "sun":
				System.out.println("You are on sun.");
				double l = obj.weight(27.01);
				System.out.println("Your weight on sun is "+l+"kg");
				break;
				case "venus":
				System.out.println("You are on venus.");
				double v = obj.weight(0.91);
				System.out.println("Your weight on venus is "+v+"kg");
				break;
				case "earth":
				System.out.println("You are on earth.");
				double e = obj.weight(1);
				System.out.println("Your weight on earth is "+e+"kg");
				break;
				case "mars":
				System.out.println("You are on mars.");
				double m = obj.weight(0.38);
				System.out.println("Your weight on mars is "+m+"kg");
				break;
				case "jupiter":
				System.out.println("You are on jupiter.");
				double ju = obj.weight(2.34);
				System.out.println("Your weight on jupiter is "+ju+"kg");
				break;
				case "saturn":
				System.out.println("You are on saturn.");
				double s = obj.weight(1.06);
				System.out.println("Your weight on saturn is "+s+"kg");
				break;
				case "uranus":
				System.out.println("You are on uranus.");
				double u = obj.weight(0.92);
				System.out.println("Your weight on uranus is "+u+"kg");
				break;
				case "neptune":
				System.out.println("You are on neptune.");
				double n = obj.weight(1.19);
				System.out.println("Your weight on neptune is "+n+"kg");
				break;
				case "moon":
				System.out.println("You are on moon.");
				double mo = obj.weight(0.166);
				System.out.println("Your weight on neptune is "+mo+"kg");
				break;
				default:
				        System.out.println("Invalid input.");
				break;
				
				
				
			}
			
		}while(ch!= "earth" || ch!= "sun" || ch!= "venus" || ch!="jupiter" || ch!="saturn" || ch!="uranus" || ch!="mars" || ch!="neptune" || ch!="moon");
		
		
		
		
	}
}
//- speed of planet 
//- revoltuion speed of planet 
  //- distance 
  //- weight of planet 
  //- weight on planet
