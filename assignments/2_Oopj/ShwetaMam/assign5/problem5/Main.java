package assign5.problem5;

/***
 * Write a Java program to create a base class Vehicle with methods
 * startEngine() and stopEngine(). Create two subclasses Car and Motorcycle
 * Override the startEngine() and stopEngine() methods in each subclass to
 * start and stop the engines differently.
 */

public class Main {
    public static void main(String[] args) {
        Car car = new Car("creata");
        car.startEngine();
        car.stopEngine();

        Motorcycle motor = new Motorcycle("yamaha fz");
        motor.startEngine();
        motor.stopEngine();

    }    
}
