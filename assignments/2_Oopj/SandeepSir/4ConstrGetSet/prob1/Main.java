package prob1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoanAmortizationCalculatorUtil calculatorUtil = new LoanAmortizationCalculatorUtil();
		
		int choice;
		while ((choice = calculatorUtil.menuList(sc)) != 0) {
			switch (choice) {
			case 1:
				calculatorUtil.acceptRecord(sc);
				break;
			case 2:
				calculatorUtil.printRecord();
				break;
				
			default:
				System.out.println("Wrong Choice");
			}
			
			
		}
		System.out.println("Thanks ....");
		sc.close();
		

	}

}
