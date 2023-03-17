import java.util.*;
class Account{
	Scanner sc = new Scanner(System.in); 
	private String acc_no;
	private String acc_name;
	private String acc_type;
	double acc_balance;
	
	public void openAcc(){
		System.out.println("Enter Account No:");
		acc_no = sc.next();
		System.out.println("Enter Account type:");
		acc_type = sc.next();
		System.out.println("Enter name:");
		acc_name = sc.next();
		System.out.println("Enter Balance:");
		acc_balance = sc.nextLong();
	}

	public void showAccount(){
		System.out.println("Name of account holder: "+acc_name);
		System.out.println("Account no: "+acc_no);
		System.out.println("Account type: "+acc_type);
		System.out.println("Balance: "+acc_balance);
	}
	public boolean searchAcc(String acc_no){
		if(this.acc_no.equals(acc_no)){
			showAccount();
			return true;
			
		}
		else{
			return false;
			
		} 
			
	}
	
}
class SavingAcc extends Account{
	double yearlyrate = 5.5;
	public double intrestRate(){
		double t = (yearlyrate * acc_balance*12)-acc_balance;
		return t;
		
	}
	
	
}
class CurrentAcc extends Account{
	
}
class Manager{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of accunts you want to enter");
		int n = sc.nextInt();
		//System.out.println("Enter 1 to create current account \nEnter 2 to create savings account.");
		//int ch = sc.nextInt();
		
		
		CurrentAcc c[] = new CurrentAcc[n];
		
	    SavingAcc s[] = new SavingAcc[n];
		/*switch(ch){
			case 1:
			for(int i = 0;i < n;i++){
			c[i] = new CurrentAcc();
			c[i].openAcc();
			}
			break;
			case 2:
			for(int i = 0;i < n;i++){
			s[i] = new SavingAcc();
			s[i].openAcc();
			}
			break;
			
		}*/
		int cho;
		do{
			System.out.println("Enter 1 to create current account \nEnter 2 to create savings account.");
		    int ch = sc.nextInt();
			switch(ch){
				case 1:
			    for(int i = 0;i < n;i++){
			    c[i] = new CurrentAcc();
			    c[i].openAcc();
			    }
			    break;
			    case 2:
			    for(int i = 0;i < n;i++){
			    s[i] = new SavingAcc();
			    s[i].openAcc();
			    }
                break;
			}
			System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Current Account number\n 3. Search by Saving Account number \n 4. Calculate the intrest rate \n");  
			            System.out.println("Enter your choice: ");  
            cho = sc.nextInt();
			switch(cho){
				case 1:
				for(int i = 0;i < n;i++){
					System.out.println("Current Account");
					c[i].showAccount();
					
				}
				for(int i = 0;i < n;i++){
					System.out.println("Saving Account");
					s[i].showAccount();
				}
				break;
				case 2:
				System.out.print("Enter current account no. you want to search: ");
				String acc_no = sc.next();
				boolean found = false; 
                for (int i = 0; i < n; i++) {  
                    found = c[i].searchAcc(acc_no);
							//found2 = s[i].searchAcc(acc_no);	
                        if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist");
				        }
				break;		
						
				case 3:
				boolean found2 = false;
				System.out.print("Enter saving account no. you want to search: ");
				String acc_no2 = sc.next();
				for (int i = 0; i < n; i++) {  
                            found2 = s[i].searchAcc(acc_no2);
							//found2 = s[i].searchAcc(acc_no);
							
                            if (found2) {  
                                break;  
                            }  
                        }  
                        if (!found2) {  
                            System.out.println("Search failed! Account doesn't exist");
				        }
				break;
				case 4:
				 System.out.println("The annual intrest on each account is ");
				 for(int i =0;i<n;i++){
					  System.out.println(s[i].intrestRate());
				 }
				break; 
				 
				
				
			
				
			}
		}
		while(cho<5);
			
		
		
		
	}
}