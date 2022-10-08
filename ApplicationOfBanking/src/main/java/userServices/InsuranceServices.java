package userServices;

public class InsuranceServices {
	
public void insurance() {
	System.out.println("Select number for kind of insurance" +'\n'+ "1 . AUTO "+'\n'+"2 . HOME "+'\n' +"3 . HEALTH");
	int insuranceInput = BankServices.inputService.nextInt();
	switch (insuranceInput) {
	case 1 : 
		autoInsurance();
		break;
	case 2 :
		homeInsurance();
		break;
	case 3:
		healthInsurance();
		break;
		default :
			System.out.println("please select valid number form above");
			 insurance() ;
	}
	
	
}
public static void  autoInsurance() {
	System.out.println("Welcome to Auto Insurance Help Desk ");
}
public static void homeInsurance() {
	System.out.println("Welcome to HOME Insurance Help Desk ");
}
public static void healthInsurance() {
	System.out.println("Welcome to HEALTH Insurance Help Desk ");
	
}
}

