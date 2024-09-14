package problem9;

public class Aeroplane {
    //private String name = "Tejas";
    //private int identityNumber =  119;
    private Seat[][] seats;

    public Aeroplane(){

    }

    public Aeroplane(int columns, int rows){
        seats = new Seat[rows][columns];
    }

    public void InitializeSeats(int row, int columns){
        seats = new Seat[row][columns];
        int k= 1;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat(k++);
            }
        }
        
    }

    public Seat[][] getSeats(){
        return seats;
    }

}
