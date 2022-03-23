package Assignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter =1;//using in while loop to go back to menu
		Scanner sc = new Scanner(System.in);
		PersonAccountDetails person = new PersonAccountDetails();

		System.out.println("Choose your banking");
		int userSelect = sc.nextInt();//to choose atm or online

		
		//atm
		if (userSelect == 1) {

			Atm atm = new Atm();
			//if pin is ok
			if (atm.userIdentification() == true) {
				System.out.println("you are logged in");

				while (counter==1) {
					//menu options
					System.out.println("What would like to do today");
					System.out.println("Enter 1 for deposit");
					System.out.println("Enter 2 for withdrawl");
					System.out.println("Enter 3 to check balance");
					System.out.println("Enter 4 for transferFund");
					System.out.println("Enter 5 for investment");
					System.out.println("Enter 6 for pin Change");
					int choice = sc.nextInt();
					switch (choice) {
					//deposit-calling deposit method & saving in 
					case 1: {
						System.out.println("Enter the amount you want to deposit");
						double deposit = sc.nextDouble();
						 atm.deposit(deposit);
						break;
					}
					//calling withdraw method
					case 2: {
						System.out.println("Enter the amount you want to withdrawl");
						double withdraw = sc.nextDouble();
					      atm.withdraw(withdraw);
						
						break;
					}
                  //checking accountBalance and using bankingrules accountBalance
					case 3: {
						System.out.println("Check total amount in your account" + atm.accountBalance);
						break;
					}
					//calling fundTranfer method
					case 4: {
						System.out.println("Enter amount you want to transfer");
						double transferAmount = sc.nextDouble();
						atm.fundTransfer(transferAmount);
						break;

					}
					//calling investment method
					case 5: {
						System.out.println("Enter amount you wants to invest");
						double investment = sc.nextDouble();
						atm.investment(investment);
						break;
					}
                    //calling pinChange method
					case 6: {
						System.out.println("Enter your new pin");
						int newpin = sc.nextInt();
						atm.pinChange(newpin);
						System.out.println("Pin has been updated:" + newpin);
						break;
					}

					default: {
						System.out.println("Please select valid option");
					}

					}
				}
			}
		}
         //online
		else if (userSelect == 2) {
			OnlineBanking online = new OnlineBanking();
			if (online.userIdentification() == true) {
				System.out.println("you are logged in");

				while (counter==1) {
					System.out.println("What would like to do today");
					System.out.println("Enter 1 for deposit");
					System.out.println("Enter 2 for withdrawl");
					System.out.println("Enter 3 to check balance");
					System.out.println("Enter 4 for transferFund");
					System.out.println("Enter 5 for investment");
					System.out.println("Enter 6for pin change");
					int choice1 = sc.nextInt();
					switch (choice1) {
					case 1: {
						System.out.println("Enter the amount you want to deposit");
						double deposit = sc.nextDouble();
						 online.deposit(deposit);

						break;
					}
					case 2: {
						System.out.println("Enter the amount you want to withdrawl");
						double withdraw = sc.nextDouble();
						online.withdraw(withdraw);
						
						break;
					}

					case 3: {
						System.out.println("Check total amount in your account" + online.accountBalance);
						break;
					}
					case 4: {
						System.out.println("Enter amount you want to transfer");
						double transferAmount = sc.nextDouble();
						online.fundTransfer(transferAmount);
						break;

					}
					case 5: {
						System.out.println("Enter amount you wants to invest");
						double investment = sc.nextDouble();
						online.investment(investment);
					}
					case 6: {
						System.out.println("Enter new pin");
						int newpin = sc.nextInt();
						online.pinChange(newpin);
						System.out.println("Pin has been updated" + newpin);
						break;
					}

					default: {
						System.out.println("Please select valid option");
					}

					}

				}
			}
		}

	}

}
