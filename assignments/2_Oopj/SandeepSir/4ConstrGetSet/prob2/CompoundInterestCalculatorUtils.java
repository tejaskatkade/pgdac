package prob2;

import java.util.Scanner;

public class CompoundInterestCalculatorUtils {

	CompoundInterestCalculator compCalculator = new CompoundInterestCalculator();
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		
		System.out.println("Enter Principal Amount : ");
		compCalculator.setPrincipal(sc.nextDouble());

		System.out.println("Enter Interest Rate : ");
		compCalculator.setAnnualInterestRate(sc.nextFloat());

		System.out.println("Enter Number of Compounds : ");
		compCalculator.setNumberOfCompounds(sc.nextInt());

		System.out.println("Enter Loan Terms (years) : ");
		compCalculator.setYears(sc.nextFloat());

	}

	public void printRecord() {
		// System.out.println("prin :"+compCalculator.getPrincipal());
		// System.out.println("no of compn :"+compCalculator.getNumberOfCompounds());
		// System.out.println("years :"+compCalculator.getYears());
		// System.out.println("roi :"+compCalculator.getAnnualInterestRate());


		double futureValue = compCalculator.calculateFutureValue();
		System.out.println("Total Future Value : " + futureValue);

		double totalInterest = futureValue - compCalculator.getPrincipal();
		System.out.println("Total Interest : " + totalInterest);

	}

	public int menuList() {
		
		System.out.println("Select Option :");
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Print Record");
		System.out.println();
		int choice = sc.nextInt();
		return choice; 
		
	}

}
