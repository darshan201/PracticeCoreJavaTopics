package userServices;







// NEED TO ADD PROPER STEP AFTER USER NAME AND NUMBER 






public class InsuranceServices {
	int insuranceInput;
public void insurance() {
	System.out.println("Select number for kind of insurance" +'\n'+ "1 . AUTO "+'\n'+"2 . HOME "+'\n' +"3 . HEALTH");
	try {
		
	 insuranceInput = Integer.parseInt(BankServices.inputService.next());
	 
	}catch(NumberFormatException e ) {
		System.out.println('\n'+"please enter valid number in integer");
		insurance();
	}
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
			 break;
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

