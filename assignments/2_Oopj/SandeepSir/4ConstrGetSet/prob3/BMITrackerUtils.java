package prob3;

import java.util.Scanner;

public class BMITrackerUtils {

	BMITracker bmiTracker = new BMITracker();

	public void acceptRecord(Scanner sc) {
		System.out.println("Enter weight (kg) :");
		bmiTracker.setWeight(sc.nextFloat());
		System.out.println("Enter heighr (m) :");
		bmiTracker.setHeight(sc.nextFloat());
	}

	public void printRecord() {
		System.out.println("BMI value: " + bmiTracker.calculateBMI());
		System.out.println("Category : " + bmiTracker.classifyBMI());
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
