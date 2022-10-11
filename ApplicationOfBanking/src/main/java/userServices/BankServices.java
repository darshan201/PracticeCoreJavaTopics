package userServices;

import java.util.NoSuchElementException;
import java.util.Scanner;

import accountHolderInformation.AccountHolderData;
import accountHolderInformation.Typeofaccounts;
import accountServices.AccountService;

public class BankServices {

	public static Scanner inputService = new Scanner(System.in);

	String userInput;

	public void services() {

		try {
			System.out.println("select service you need" + '\n' + "  Account " + '\n' + " Insurance ");

			userInput = inputService.nextLine();
		} catch (NoSuchElementException NoSuchElement) {
			System.out.println("plese enter valid service");
		}

		if (userInput.equalsIgnoreCase("Account")) {
			System.out.println("welcome to account services");
			Typeofaccounts accounttype = new Typeofaccounts();
			accounttype.accountType();
			AccountHolderData userData = new AccountHolderData();
			userData.username();
			userData.useraccountnumber();
			// UserData.useraccountbalance();
			AccountService userTransaction = new AccountService();
			userTransaction.AccountTranscation();
			;

		} else if (userInput.equalsIgnoreCase("Insurance")) {
			System.out.println("welcome to insurance service");
			InsuranceServices userInsurance = new InsuranceServices();
			userInsurance.insurance();
			AccountHolderData userData = new AccountHolderData();
			userData.username();
			userData.useraccountnumber();

		} else {
			System.out.println("plese select valid service");
			services();
		}

	}

}
