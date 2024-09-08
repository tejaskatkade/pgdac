package prob3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BMITrackerUtils utils = new BMITrackerUtils();
		
		Scanner sc = new Scanner(System.in);


		int choice;
		while ((choice = utils.menuList(sc)) != 0) {
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
		System.out.println("Thanks ....");
			

	}

}
