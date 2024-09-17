package assign5.problem5;

public class Car implements Vehicle{
    private String name;

    public Car(String name){
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Engine started...");
    }
    
    public void stopEngine(){
        System.out.println("Engine Stopped.....");
    }
}
