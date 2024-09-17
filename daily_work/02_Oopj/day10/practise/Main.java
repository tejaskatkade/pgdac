package day10.practise;

import day10.demo1.Person;

class Parent{

    int num1 = 1;

    // public void printRec(){
    //     System.out.println("parent");
    // }
}

class Child extends Parent{

    int num2 = 1;

    public void printRec(){
        System.out.println("Child");
    }

}

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        //parent.printRec();          // Parent
        
        Child child = new Child();
        child.printRec();          // Child

        Parent parent2 = new Child(); // Upcasting
        //parent2.printRec();




        Parent parent3 = new Child(); // upcasting

        //Parent p = new Parent(); // ----

        Parent p = null;
        //Parent p = new Child(); // UPCASITNG
        Child c =(Child) p; // DOWNCASTING



    }
}
