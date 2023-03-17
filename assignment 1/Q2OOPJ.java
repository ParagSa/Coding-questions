import java.util.*;

class DateDemo{
	int Day;
	int Month;
	int year;
	
	int prevDay(){
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
			System.out.println("leap year");
			//System.out.println(Month);
			if(Month%2==0){
				//System.out.println("month");
				if(Day==1){
					//System.out.println("day");
					return 31;
				}else{
					return --Day;
				}
			}else if(Month==3 && Day==1){
				return 29;
				
			}else if(Day==1){
				return 30;
			}else{
				return --Day;
			}
		}else{
			if(Month%2==0){
				if(Day==1){
					return 31;
				}else{
					return --Day;
				}
			}else if(Month==3 && Day==1){
				return 28;
				
			}else if(Day==1){
				return 30;
			}else{
				return --Day;
			}
			
		}
	}
	int nextDay(){
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
			//System.out.println("leap year");
			//System.out.println(Month);
			if(Month%2==0){
				//System.out.println("month");
				if(Day==30){
					//System.out.println("day");
					return 1;
				}else{
					return ++Day;
				}
			}else if(Month==2 && Day==29){
				return 1;
				
			}else if(Day==31){
				return 1;
			}else{
				return ++Day;
			}
		}else{
			if(Month%2==0){
				if(Day==30){
					return 1;
				}else{
					return ++Day;
				}
			}else if(Month==2 && Day==28){
				return 1;
				
			}else if(Day==31){
				return 1;
			}else{
				return ++Day;
			}
			
		}
		
	}
	DateDemo(){
		
	}
	DateDemo(int day, int month,int year ){
		Day= day;
		Month=month;
		this.year = year;
		
	}
	/*DateDemo(int day, int month,int year){
		Day= day;
		Month=month;
		this.year = year;
		
	}
	DateDemo(int day, int month,int year){
		Day= day;
		Month=month;
		this.year = year;
	}*/
}
class Q2OOPJ{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int Day = sc.nextInt();
		int Month1= sc.nextInt();
	    int year=  sc.nextInt();
		DateDemo obj = new DateDemo(Day,Month1,year);
		System.out.println("Previous Day "+obj.prevDay());
		System.out.println("Next Day "+obj.nextDay());
		
	}
}