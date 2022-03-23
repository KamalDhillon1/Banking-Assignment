package Assignment;

public abstract class BankingRules {
	
	 double accountBalance=2000; //initialsing accountBalance
	 
	 //getter and setter for accountBalance
	 public double getAccountBalance() {
		 return accountBalance;
	 }
	 public void setAccountBalance(double accountBalance) {
		 this.accountBalance=accountBalance;
	 }
	 //userIdentification is abstract
	public abstract boolean userIdentification();
	 
	 public int noOfTransactionAllowed() {
			return 4;
		}
	 //pin change method is abstract
	 public abstract void pinChange(int pinChange);

	 //setting dailywithdrawl limit
	 public double dailyWithdrawalLimit() {
			return 1500;
		}
	
		
	}

	 

