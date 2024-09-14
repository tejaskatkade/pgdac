package problem9;

public class Seat {
    
    private int seatNumber;
    private boolean isOccupied = false;


    public Seat(){

    }

    public Seat(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
    public boolean isOccupied() {
        return isOccupied;
    }

    public void cancleSeat() {
        this.isOccupied = false;
        System.out.println("Your Seat Cancled...");
    }

    public void bookSeat(){
        if(isOccupied){
            System.out.println("Seat is already occupied..");
        }else{
            this.isOccupied = true;
            System.out.println("Seat Booked... ");
        }
    }


    

}
