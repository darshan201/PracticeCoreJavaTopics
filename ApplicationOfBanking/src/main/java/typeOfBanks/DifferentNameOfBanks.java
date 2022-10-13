package typeOfBanks;

import java.util.InputMismatchException;
import java.util.Scanner;

import userServices.BankServices;

public class DifferentNameOfBanks {

	public static Scanner inputName = new Scanner(System.in);
int name ;
	public void nameOfBanks() {

		System.out.println("Please select Bank-Number " + '\n'+'\n' + "1 = RBC" + '\n' + "2 = Scotia" + '\n' + "3 = CIBC");

		try {

			 name = Integer.parseInt(inputName.next()) ;
			
		} catch (NumberFormatException InputError) {
			System.out.println('\n'+"please enter valid number for bank selection" + '\n');

		}

			switch (name)  {
			case 1:
				System.out.println('\n'+"Welcome to [ RBC BANK ]"+ '\n');
				break;

			case 2:
				System.out.println('\n'+"welcome to [ SCOTIA BANK ]"+ '\n');
				break;
			case 3:
				System.out.println('\n'+"Welcome to [ CIBC BANK ]"+ '\n');
				break;
			default:
				System.out.println('\n'+"please enter valid number " + '\n');
				nameOfBanks();
			}

			

		

		BankServices nameOfService = new BankServices();
		nameOfService.services();

	}
}
