package problem9;

import java.util.Scanner;

public class AeroUtil {
    Aeroplane a = new Aeroplane();
    static Scanner sc = new Scanner(System.in);

    public AeroUtil(){

    }

    {
        System.out.println("Enter Aeroplane seats Details");
        System.out.print("Enter row count :   ");
        int row = sc.nextInt();
        System.out.print("Enter column count :   ");
        int col = sc.nextInt();

        a.InitializeSeats(row, col);
    }

    public void currentSeatingChart(){
        Seat[][] seat = a.getSeats();

        System.out.println("**** SEATING CHART ****");
    
        for (Seat[] seats : seat) {
            for (Seat s : seats) {
                if(!s.isOccupied()){
                    System.out.printf("%5d   ",s.getSeatNumber());
                }else{
                    System.out.printf("%5s   ","*");
                }
            }
            System.out.println();
        }
    }

    public void bookSeat(){
        Seat[][] seat = a.getSeats();
        System.out.print("Enter seat number to book : ");
        int num = sc.nextInt();

        loop1:
        for (Seat[] seats : seat) {
            for (Seat s : seats) {
                if(s.getSeatNumber() == num){
                    s.bookSeat();
                    break loop1;    
                }
            }
        }
    }
   
    public void cancleBookedSeat(){
        Seat[][] seat = a.getSeats();
        System.out.print("Enter seat number to cancle   : ");
        int num = sc.nextInt();

        loop1:
        for (Seat[] seats : seat) {
            for (Seat s : seats) {
                if(s.getSeatNumber() == num){
                    s.cancleSeat();    
                    break loop1;
                }
            }
        }
    }

    public void isSeatAvailable(){
        Seat[][] seat = a.getSeats();
        System.out.print("Enter seat number  : ");
        int num = sc.nextInt();

        loop1:
        for (Seat[] seats : seat) {
            for (Seat s : seats) {
                if(s.getSeatNumber() == num){
                       if (!s.isOccupied()) {
                            System.out.println(num+"  Number Seat is Available to Book");
                       }else{
                            System.out.println(num+" Number Seat is Not Available to Book ");
                       }
                       break loop1; 
                }
            }
        }
    }


    public static int menuList(){
        System.out.println("0. EXIT");
        System.out.println("1. BOOK A SEAT");
        System.out.println("2. CANCLE BOOKING");
        System.out.println("3. CHECK AVAILABILITY OF SEAT");
        System.out.println("4. DISPLAY AVAILABLE SEATS");
        System.out.print("Enter choice  :   ");
        return sc.nextInt();

    } 

    public static void releaseResources(){
        sc.close();
    }




}
