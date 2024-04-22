package accountmanagemnet;

public class AccountManagement {

	public static void main(String[] args) {
		
		 Account account1 = new Account(1001, "Alice", 1000.0);
	     Account account2 = new Account(1002, "Bob", 2000.0);
	     Account account3 = new Account(1003,"Amar",3000.0);
	     
	     int numberOfAccounts = Account.getCount();
	     System.out.println("Number of accounts created: " + numberOfAccounts);
	     
	     
	     account1.deposit(500.0);
	     account1.showAccountInfo();

	     account2.withdraw(1000.0);
	     account2.showAccountInfo();
	     
	     account3.deposit(500.0);
	     account3.showAccountInfo();
	    }

	}


