package day10.demo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShapeUtils utils = new ShapeUtils();
        Menu choice;
        while( ( choice = ShapeUtils.menuList(sc) ) != Menu.EXIT) {

            Shape shape = ShapeFactory.getInstance(choice,sc);
            if(shape != null){
                utils.acceptRecord(shape, sc);
                utils.printRecord(shape);  
            }
        }

        sc.close();
        
    }
}
