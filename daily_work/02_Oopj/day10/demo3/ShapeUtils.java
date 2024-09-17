package day10.demo3;
import java.util.Scanner;

public class ShapeUtils {
    
    
    public void acceptRecord(Shape shape, Scanner sc){
         //Rectangle

        if(shape instanceof Rectangle){

            Rectangle rectangle = (Rectangle)shape; // DOWNCASTING
            System.out.print("Enter Length    :   ");
            rectangle.setBreadth(sc.nextFloat());
            System.out.print("Enter  Breadth   :   ");
            rectangle.setLength(sc.nextFloat());
            
        }else{
            //Circle
            Circle circle = (Circle)shape;
            System.out.print("Enter Radius  :   ");
            circle.setRadius(sc.nextFloat());
        }

    }

    public void printRecord(Shape shape){
        shape.calculateArea();          //DYNAMIC METHOD DISPACH
        if (shape instanceof Rectangle) {
            System.out.println("Area of Rectangle is :  " + shape.getArea());
        }else{
            System.out.println("Area of Circle is :  " + shape.getArea());
        }
    }

    public static Menu menuList(Scanner sc){
        System.out.println("0. Exit");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter Choice  : ");
        return Menu.values()[sc.nextInt()];        
    }
}
