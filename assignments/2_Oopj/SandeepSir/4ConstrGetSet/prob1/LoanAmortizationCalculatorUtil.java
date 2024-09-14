package prob1;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	
	LoanAmortizationCalculator loan = new LoanAmortizationCalculator();
	//static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord(Scanner sc) {
		System.out.println("Enter Principal Amount : ");
		loan.setPrincipal(sc.nextDouble());

		System.out.println("Enter Interest Rate : ");
		loan.setRateOfInterest(sc.nextDouble());

		System.out.println("Enter Loan Terms (years) : ");
		loan.setLoanTerm(sc.nextFloat());

	}
	public void printRecord() {
		
		System.out.printf("Monthly Amount Paid : ₹ %.2f \n",loan.calculateMonthlyPayment());
		System.out.printf("Total Amount Paid : ₹ %.2f \n", (loan.calculateMonthlyPayment() * loan.getLoanTerm() * 12));
		System.out.println();
	}
	
	public int menuList(Scanner sc) {
		
		System.out.println("Select Option :");
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Print Record");
		System.out.println();
		int choice = sc.nextInt();
		return choice; 
		
	}
}
