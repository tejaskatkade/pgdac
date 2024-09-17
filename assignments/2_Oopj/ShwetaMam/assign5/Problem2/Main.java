package assign5.Problem2;

/**
 * Create a base class Vehicle with attributes like make and year.
 * Provide a constructor in Vehicle to initialize these attributes. Derive a
 * class Car that has an additional attribute model and write a constructor
 * that initializes make, year, and model. Write a program to create a Car
 * object and display its details.
 */

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Ford","Mustang",2022);
        Vehicle v2 = new Car("Tata","Curve",2024);
    
        System.out.println(v1);
        System.out.println(v2);
    }
}
