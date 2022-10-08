package accountHolderInformation;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Typeofaccounts {

	public void accountType() {

		try {
			System.out.println("select account type : 1= saving , 2 = checking ");
			Scanner inputAccountType = new Scanner(System.in);
			int accountType = inputAccountType.nextInt();
			switch (accountType) {
			case 1:
				System.out.println("Saving account ");
				break;

			case 2:
				System.out.println("checking  account ");
				break;

			default:

				System.out.println("select saving or checking account ");
				accountType();

			}

		} catch (NoSuchElementException ElementException) {
			System.out.println("please enter valid account Type");
		}

	}
}
