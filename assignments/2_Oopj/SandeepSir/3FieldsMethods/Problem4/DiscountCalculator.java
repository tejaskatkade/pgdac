package com.assignment3;

import java.util.Scanner;

public class DiscountCalculator {
	
	
	private float originalPrice;
	private float discountRate;
	//private float discountAmount;
	
	// methods acceptRecord, calculateDiscount & printRecord
	
	public void acceptRecord() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price");
		this.originalPrice = sc.nextFloat();
		System.out.println("Enter Discount rate : ");
		this.discountRate = sc.nextFloat();
		
	}
	public float calculateDiscount() {
		float discountAmount = this.originalPrice * (this.discountRate / 100 );		
		float finalAmount = this.originalPrice - discountAmount;
		return  finalAmount;
	}
	
	public void printRecord() {
		float finalAmount = calculateDiscount();
		System.out.println("Final Amount : "+ finalAmount );
	} 
}
