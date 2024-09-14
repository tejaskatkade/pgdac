package prob4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DiscountCalculatorUtils utils = new DiscountCalculatorUtils();

		int choice;
		while ((choice = DiscountCalculatorUtils.menuList(sc)) != 0) {
			switch (choice) {
				case 1:
				utils.acceptRecord(sc);
					break;
				case 2:
				utils.printRecord();
					break;
					
				default:
					System.out.println("Wrong Choice");
			}
		}
		sc.close();
	}
}