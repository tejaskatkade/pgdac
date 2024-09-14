package prob4;

import java.util.Scanner;

public class DiscountCalculatorUtils {

	DiscountCalculator calculator = new DiscountCalculator();
	
	public void acceptRecord(Scanner sc) {
		System.out.println("Enter Price");
		calculator.setOriginalPrice(sc.nextFloat());
		System.out.println("Enter Discount rate : ");
		calculator.setDiscountRate(sc.nextFloat());
		
	}

	public void printRecord() {
		System.out.println("Final Amount : "+ calculator.calculateDiscount());
	} 

	public static int menuList(Scanner sc) {

		System.out.println("Select Option :");
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Print Record");
		System.out.println();
		int choice = sc.nextInt();
		return choice;

	}
}
