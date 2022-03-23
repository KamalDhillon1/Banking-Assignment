package Assignment;

import java.util.Scanner;

public class Atm extends BankingRules implements StandardProcess {
	int pin;
	int totalOpt = 3;

	Scanner sc = new Scanner(System.in);

	@Override
	//overriding deposit method
	//taking accountBalance from banking rules
	public double deposit(double depositAmount) {
		double updatedBalance = depositAmount + accountBalance;
		System.out.println("Your new account balance is" + updatedBalance);
		return updatedBalance;

	}

	@Override
	//overriding withdraw method
		//taking accountBalance from banking rules
	public double withdraw(double amountwithdraw) {
		
		if (accountBalance >= amountwithdraw) {
			accountBalance = accountBalance - amountwithdraw;
			System.out.println("Your new balance is:" + accountBalance);

			System.out.println("Would you like to another withdrawl");
			String userSelect = sc.next();
			if (userSelect.equals("yes")) {
				System.out.println("Enter amount you want to withdrawl");
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

	@Override
	//overriding fundtransfer method
	public double fundTransfer(double transferAmount) {
		if (accountBalance > transferAmount) {
			accountBalance = accountBalance - transferAmount;
			System.out.println("Funds have been Transfered. Remaining amount in your account is:" + accountBalance);
		} else {
			System.out.println("Invalid amount");
		}
		return accountBalance;
	}

	@Override
	//overriding investment method
	public void investment(double investment) {

		if (accountBalance > investment) {
			accountBalance = accountBalance - investment;
			System.out.println("Remaining amount in your account is :" + accountBalance);
		} else {
			System.out.println("Invalid amount");
		}

		
	}

	@Override
	//overriding userIdentification method
	public boolean userIdentification() {
		System.out.println("Please enter your pin");
		this.pin = sc.nextInt();
		while (totalOpt != 0 && totalOpt <= 3) {
			if (pin == 1990) {
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

	@Override
	//overriding pinChange method
	public void pinChange(int newPin) {
		pin = newPin;

		
	}

}
