package day10.demo3;
import java.util.Scanner;

public class ShapeFactory {

    public static Shape getInstance(Menu choice, Scanner sc){
        Shape shape = null;
    
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
        return shape;
    }
    
}

