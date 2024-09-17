package assign5.Problem2;

public class Car extends Vehicle{
    private String model;

    public Car(){

    }
    
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString(){
        return "Car [ Make :"+this.make+", Model : "+this.model+", Year : "+this.year+"]";
    }
}
