package assign5.problem3;

/**
 * Create a base class Animal with attributes like name, and methods
 * like eat() and sleep(). Create a subclass Dog that inherits from Animal
 * and has an additional method bark(). Write a program to demonstrate the
 * use of inheritance by creating objects of Animal and Dog and calling
 * their methods
 */

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println("Animal");
        animal.eat();
        animal.sleep();
       // animal.bark();

       System.out.println("Dogy");

       Dog dog = new Dog();
       dog.eat();;
       dog.bark();
       dog.sleep();
    }

    
}
