import java.util.*;

class bank{
	private String acc_no;
	private String acc_name;
	private String acc_type;
	private long acc_balance;
	Scanner sc = new Scanner(System.in);
	
	public void openAccount(){
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
	public void deposit(){
		long amt;
		System.out.println("Enter the Account you want to deposit: ");
		amt = sc.nextLong();
		acc_balance = acc_balance + amt;
	}
	public void withdrawal(){
		long amt;
		System.out.println("Enter the amount you want to withdraw: ");
		amt = sc.nextLong();
		if(amt<=acc_balance){
			acc_balance = acc_balance-amt;
			System.out.println("Balance after withdrawal: "+acc_balance);
		}else{
			System.out.println("Your balance is less than "+amt+" \ttransaction failed...!!");
		}
	}
	public boolean search(String acno){
		if(acc_no.equals(acno)){
			showAccount();
			return(true);
			
		}
	    return (false);
		
	}
}
class BankingApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		bank C[] = new bank[n];
		for(int i = 0;i < n;i++){
			C[i] = new bank();
			C[i].openAccount();
		}
		int ch;
		do{
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Add account \n 6. Exit. ");  
			            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();
			switch(ch){
				case 1:
				for(int i = 0;i < n;i++){
					C[i].showAccount();
				}
				break;
				case 2:
				System.out.print("Enter account no. you want to search: ");
				String acc_no = sc.next();
				boolean found = false;  
                        for (int i = 0; i < n; i++) {  
                            found = C[i].search(acc_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist");
				        }
				break;
                case 3:  
                        System.out.print("Enter Account no. : ");  
                        acc_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < n; i++) {  
                            found = C[i].search(acc_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                break;
                case 4:  
                        System.out.print("Enter Account No : ");  
                        acc_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < n; i++) {  
                            found = C[i].search(acc_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {
			              System.out.println("Search failed! Account doesn't exist");  				
			           }
				break;
				case 5:
				       System.out.print("Add account: ");
					   System.out.print("How many number of customers do you want to input? ");
		               int n1 = sc.nextInt();
		               bank K[] = new bank[n1];
		               for(int i = 0;i < n1;i++){
			              K[i] = new bank();
			              K[i].openAccount();
		                }
					   
				break;   
					   
				case 6:  
                        System.out.println("See you soon...");  
                break;  
                }  
            }
            while(ch!=5);			
			
			
			
		}
		
	}