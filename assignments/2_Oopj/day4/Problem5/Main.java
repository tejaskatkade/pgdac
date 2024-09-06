package com.assignment3;

public class Main {
	public static void main(String[] args) {
		TollBoothRevenueManager revenueManager = new TollBoothRevenueManager();
		revenueManager.acceptRecord(100,50,10);//c t b 5000 +5000 +300 = 10300
		revenueManager.printRecord();

	}
}
