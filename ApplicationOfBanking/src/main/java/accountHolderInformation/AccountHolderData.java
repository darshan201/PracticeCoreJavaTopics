package accountHolderInformation;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountHolderData {

	private String accountHolderName;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	private int accountnumber;

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public static double accountbalance = 10000;

	public double getAccountbalance() {
		return accountbalance;
	}

	public static Scanner Inputuser = new Scanner(System.in);

	public void username() {
		try {
			System.out.println("UserName : ");
			String Name = Inputuser.nextLine();
			setAccountHolderName(Name);
			System.out.println(" WELCOME " + getAccountHolderName().toUpperCase());

		} catch (NoSuchElementException ElementException) {
			System.out.println("please enter valid Name in String ");
			
		}

	}

	public void useraccountnumber() {
		try {
			System.out.println("Account NUmber : ");
			int number = Inputuser.nextInt();
			setAccountnumber(number);
			System.out.println("Account number is : " + getAccountnumber());
		} catch (NoSuchElementException ElementException) {
			System.out.println("please enter valid number in integer");

		}

	}

	public void useraccountbalance() {

		System.out.println(getAccountbalance());

	}

}
