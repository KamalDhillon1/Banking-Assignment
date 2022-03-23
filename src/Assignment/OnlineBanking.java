package Assignment;

import java.util.Scanner;
//We are extending BankingRules Class & implementiong StandardProcess
public class OnlineBanking extends BankingRules implements StandardProcess {
	int pin; //taking variables for userIdentification as class level
	int totalOpt = 2;// taking variables for userIdentification as calss level

	
	Scanner sc = new Scanner(System.in);
      //overriding deposit method
	//taking accountBalance from BankingRules Class
	@Override
	public double deposit(double depositAmount) {
		double updatedBalance = depositAmount + accountBalance;
		System.out.println("Your new account balance is" + updatedBalance);
		return updatedBalance;

	}
     //overriding withdraw method
	//taking accountBalance from BankingRules Class
	@Override
	public double withdraw(double amountwithdraw) {
		System.out.println("Enter amount you want to withdraw");

		if (accountBalance >= amountwithdraw) {
			accountBalance = accountBalance - amountwithdraw;
			System.out.println("Your new balance is:" + accountBalance);
			System.out.println("Would you like to another withdrawl");
			String userSelect = sc.next();
			if (userSelect.equals("yes")) {
				System.out.println("Enter amount you want to withdraw");
				accountBalance = accountBalance - amountwithdraw;
				System.out.println("Your new balance is:" + accountBalance);
			} else {
				System.out.println(" Have a Good day");

			}
		} else {
			System.out.println("Insufficiant amount");
		}
		return accountBalance;
	}
//overriding fundtransfer method
	@Override
	public double fundTransfer(double transferAmount) {
		if (accountBalance > transferAmount) {
			accountBalance = accountBalance - transferAmount;
			System.out.println("Remaining amount in your account is:" + accountBalance);
		} else {
			System.out.println("Invalid amount");
		}
		// TODO Auto-generated method stub
		return accountBalance;
	}
//overriding investment method
	@Override
	public void investment(double investment) {
		if (accountBalance > investment) {
			accountBalance = accountBalance - investment;
			System.out.println("Remaining amount in your account is :" + accountBalance);
		} else {
			System.out.println("Invalid amount");
		}

		

	}
//overriding userIdentification method 
	@Override
	public boolean userIdentification() {
		System.out.println("Please enter your pin");
		this.pin = sc.nextInt();
		while (totalOpt != 0 && totalOpt <= 2) {
			if (pin == 1997) {
				return true;
			} else {
				System.out.println("Wrong Pin");
				System.out.println("Please enter you pin");
				this.pin = sc.nextInt();
				totalOpt--;
			}

		}
		if (totalOpt <= 2) {
			System.out.println("Account Locked");
		}
		return false;

	}
//overriding pinChange method
	@Override
	public void pinChange(int newPin) {
		// TODO Auto-generated method stub
		pin = newPin;
	}

}
