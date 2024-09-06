package com.assignment3;

public class TollBoothRevenueManager {
	
	private float carPrice;
	private int carCount;
	
	private float truckPrice;
	private int truckCount;
	
	private float motorCyclePrice;
	private int motorCycleCount;
	
	private float totalRevenue;
	
	public TollBoothRevenueManager() {
		setTollRates();
	}
	
	public void acceptRecord(int carCount, int truckCount, int motorCycleCount) {
		this.carCount = carCount;
		this.truckCount = truckCount;
		this.motorCycleCount = motorCycleCount;
	}
	
	public void setTollRates() {
		this.carPrice =50;
		this.truckPrice =100 ;
		this.motorCyclePrice =30;
	}
//	public void setTollRates(float carPrice, float truckPrice, float motorcyclePrice) {
//		this.carPrice =carPrice;
//		this.truckPrice = truckPrice;
//		this.motorCyclePrice = motorCyclePrice;
//	}
	
	public void calculateRevenue() {
		 this.totalRevenue = ( this.carPrice * this.carCount +
						  this.truckPrice * this.truckCount +
						  this.motorCyclePrice * this.motorCycleCount
						 );
	}
	
	public void printRecord() {
		calculateRevenue();
		System.out.println("Total Vehicle : "+ (this.carCount+this.motorCycleCount+this.truckCount));
		System.out.println("Total Revenue : "+this.totalRevenue);
	}
		
}
