package prob2;

public class Main {

	public static void main(String[] args) {
		
		
		CompoundInterestCalculatorUtils utils = new CompoundInterestCalculatorUtils();
	
		int choice;
		while ((choice = utils.menuList()) != 0) {
			switch (choice) {
			case 1:
				utils.acceptRecord();
				break;
			case 2:
				utils.printRecord();
				break;
				
			default:
				System.out.println("Wrong Choice");
			}
			
			
		}
		System.out.println("Thanks ....");
		
	}

}
