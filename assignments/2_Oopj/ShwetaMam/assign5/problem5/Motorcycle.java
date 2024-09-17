package assign5.problem5;

public class Motorcycle implements Vehicle {
    private String name;

    Motorcycle(String name){
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Engine started...");
    }
    
    public void stopEngine(){
        System.out.println("Engine Stopped.....");
    }


}
