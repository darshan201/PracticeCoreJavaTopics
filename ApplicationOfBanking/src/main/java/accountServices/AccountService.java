package accountServices;

import accountHolderInformation.AccountHolderData;
import userServices.BankServices;

public class AccountService {

	public void AccountTranscation() {
		System.out.println(
				"select number for service" + '\n' + "1.deposit" + '\n' + "2.withdrawal" + '\n' + "3.MoneySend");
		int inputservices = BankServices.inputService.nextInt();

		switch (inputservices) {
		case 1:
			deposit();
			break;
		case 2:
			Withdrawal();
			break;
		case 3:
			MoneySend();
			break;
		default:
			System.out.println("THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "your balance is "
					+ AccountHolderData.accountbalance);

		}

	}

	public static void deposit() {
		System.out.println(
				"Your balance is : " + AccountHolderData.accountbalance + '\n' + "please enter amount for Deposit : ");

		double getbalance = BankServices.inputService.nextDouble();
		AccountHolderData.accountbalance = AccountHolderData.accountbalance + getbalance;
		System.out.println("THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "Now your NEW balance is : "
				+ AccountHolderData.accountbalance);

	}

	public static void Withdrawal() {
		System.out.println("Your balance is : " + AccountHolderData.accountbalance + '\n'
				+ "please enter amount for Withdrawal : ");
		double getbalance = BankServices.inputService.nextDouble();
		AccountHolderData.accountbalance = AccountHolderData.accountbalance - getbalance;
		System.out.println("THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "Now your NEW balance is : "
				+ AccountHolderData.accountbalance);
	}

	public static void MoneySend() {
		System.out.println("Enter Email address : ");
		String getString = BankServices.inputService.next();

		if (getString.equals(null)) {
			System.out.println("");
		} else {
			System.out.println("Your balance is : " + AccountHolderData.accountbalance + '\n'
					+ "please enter amount for moneysend : ");
			double getbalance = BankServices.inputService.nextDouble();

			AccountHolderData.accountbalance = AccountHolderData.accountbalance - getbalance;

			System.out.println("THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "Now your NEW balance is : "
					+ AccountHolderData.accountbalance);
		}
	}

}
