package com.assignment3;

import java.util.Scanner;

public class CompoundInterestCalculator {

	private double principal;
	private float annualInterestRate;
	private int numberOfCompounds;
	private float years;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		this.principal = sc.nextDouble();

		System.out.println("Enter Interest Rate : ");
		this.annualInterestRate = sc.nextFloat();

		System.out.println("Enter Number of Compounds : ");
		this.numberOfCompounds = sc.nextInt();

		System.out.println("Enter Loan Terms (years) : ");
		this.years = sc.nextFloat();

	}

	public double calculateFutureValue() {
		double rate = this.annualInterestRate / 100;
		double futureValue =  this.principal * Math.pow((1 + (rate / this.numberOfCompounds)), (this.numberOfCompounds * this.years));
		System.out.println(futureValue);
		return futureValue;
	}

	public void printRecord() {
		double futureValue = calculateFutureValue();
		System.out.println("Total Future Value : " + futureValue);
		double totalInterest = futureValue - this.principal;
		System.out.println("Total Interest : " + totalInterest);

	}

}
