package day10.demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape shape = null;
        ShapeUtils utils = new ShapeUtils();
        Menu choice;
        while( ( choice = ShapeUtils.menuList(sc) ) != Menu.EXIT) {
			switch( choice) {
                case CIRCLE:
                    shape = new Circle();           // UPCASTING        
                break;
                case RECTANGLE:
                    shape = new Rectangle();        // UPCASTING
                break;
                default:
                    break;
			}

            if(shape != null){
                utils.acceptRecord(shape, sc);
                utils.printRecord(shape);

            }
		}


        
       sc.close();
        
        
    }
}
