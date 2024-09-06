package com.assignment3;


import java.util.Scanner;

public class LoanAmortizationCalculator {
	private double principal;
	private double rateOfInterest;
	private float loanTerm;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		this.principal = sc.nextDouble();

		System.out.println("Enter Interest Rate : ");
		this.rateOfInterest = sc.nextDouble();

		System.out.println("Enter Loan Terms (years) : ");
		this.loanTerm = sc.nextFloat();

	}

	public double calculateMonthlyPayment() {
		double monthlyInterestRate = rateOfInterest / 12 / 100;
		double numberOfMonths = loanTerm * 12;
		double monthlyPayment = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonths))
				/ (Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1);
		System.out.println("Monthly Payement : " + monthlyPayment);
		return monthlyPayment;
	}

	public void printRecord() {
		double monthlyPayment =  calculateMonthlyPayment();
		double totalAmount = monthlyPayment * this.loanTerm * 12;

		System.out.println("Total Amount Paid : " + totalAmount);
	}

	public static void main(String[] args) {

		LoanAmortizationCalculator amortizationCalculator = new LoanAmortizationCalculator();
		amortizationCalculator.acceptRecord();
		amortizationCalculator.printRecord();

	}

}
