package problem9;

/***
 * You need to implement a system to manage airplane seat assignments. The airplane
 * has seats arranged in rows and columns. Implement functionalities to:
 * 
 * Initialize the seating arrangement with a given number of rows and columns.
 * Book a seat to mark it as occupied.
 * Cancel a booking to mark a seat as available.
 * Check seat availability to determine if a specific seat is available.
 * Display the current seating chart.
 * 
 */

 
public class Main {

    public static void main(String[] args) {
        AeroUtil util = new AeroUtil();
        util.currentSeatingChart();

        int choice;
        while ((choice = AeroUtil.menuList()) != 0) {
            switch (choice) {
                case 1:
                    util.bookSeat();
                    break;
                case 2:
                    util.cancleBookedSeat();
                    break;
                case 3:
                    util.isSeatAvailable();
                    break;
                case 4:
                    util.currentSeatingChart();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }


        AeroUtil.releaseResources();
    }
    
}
