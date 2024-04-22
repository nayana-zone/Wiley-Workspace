package accountmanagemnet;

public class Account {
	


	private long accountNo;
    private String customerName;
    private double balance;
    private static int count = 0;

	
	public Account(long accountNo, String customerName, double balance) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
		count++;
		
	}

	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Account.count = count;
	}
		

	    public void deposit(double amount){
	    	if(amount > 0) {
	    		balance += amount;
	    		 System.out.println("Deposit is" + amount + " successful.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    	}


	    public void withdraw(double amount){
	    	 if (amount > 0 && balance >= amount) {
	             balance -= amount;
	             System.out.println("Withdrawal " + amount + " successful.");
	         } else {
	             System.out.println("Insufficient funds or invalid withdrawal amount.");
	         }
	    }
	    
	    

	    public void showAccountInfo(){
	    	  System.out.println("Account No: " + accountNo);
	          System.out.println("Customer Name: " + customerName);
	          System.out.println("Balance: " + balance);
	      }

	    }

		

	


