package accountServices;

import accountHolderInformation.AccountHolderData;
import userServices.BankServices;

public class AccountService {
	int inputservices;

	public void AccountTranscation() {
		System.out.println('\n'+
				"select number for service" + '\n' + "1.deposit" + '\n' + "2.withdrawal" + '\n' + "3.MoneySend" +'\n'+"4 . EXIT and BALANCE CHECK");
		try {
			inputservices = Integer.parseInt(BankServices.inputService.next());
		} catch (NumberFormatException e) {
			System.out.println('\n'+"please enter valid number");
			AccountTranscation();
		}

		switch (inputservices) {
		case 1:
			deposit();
			System.out.println('\n'+"IF YOU LIKE MORE SERVICES THAN SELECT FROM BELOWS OPTIONS");
			AccountTranscation();
			break;
		case 2:
			Withdrawal();
			System.out.println('\n'+"IF YOU LIKE MORE SERVICES THAN SELECT FROM BELOWS OPTIONS");
			AccountTranscation();
			break;
		case 3:
			MoneySend();
			System.out.println('\n'+"IF YOU LIKE MORE SERVICES THAN SELECT FROM BELOWS OPTIONS");
			AccountTranscation();
			break;
		case 4 :
			System.out.println('\n'+"THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "your balance is "
					+ AccountHolderData.accountbalance);
			break;
		default:
			System.out.println('\n'+"please enter valid number");
			AccountTranscation();
			break;

		}
		

	}

	public static void deposit() {
		System.out.println('\n'+
				"Your balance is : " + AccountHolderData.accountbalance + '\n' + "please enter amount for Deposit : ");

		double getbalance = BankServices.inputService.nextDouble();
		AccountHolderData.accountbalance = AccountHolderData.accountbalance + getbalance;
		System.out.println('\n'+"THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "Now your NEW balance is : "
				+ AccountHolderData.accountbalance);

	}

	public static void Withdrawal() {
		System.out.println('\n'+"Your balance is : " + AccountHolderData.accountbalance + '\n'
				+ "please enter amount for Withdrawal : ");
		double getbalance = BankServices.inputService.nextDouble();
		AccountHolderData.accountbalance = AccountHolderData.accountbalance - getbalance;
		System.out.println('\n'+"THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "Now your NEW balance is : "
				+ AccountHolderData.accountbalance);
	}

	public static void MoneySend() {
		System.out.println('\n'+"Enter Email address : ");
		String getString = BankServices.inputService.next();

		if (getString.equals(null)) {
			System.out.println("");
		} else {
			System.out.println('\n'+"Your balance is : " + AccountHolderData.accountbalance + '\n'
					+ "please enter amount for moneysend : ");
			double getbalance = BankServices.inputService.nextDouble();

			AccountHolderData.accountbalance = AccountHolderData.accountbalance - getbalance;

			System.out.println('\n'+"THANK YOU SO MUCH FOR CHOOSING OUR SERVICES " + "Now your NEW balance is : "
					+ AccountHolderData.accountbalance);
		}
	}
	

}
