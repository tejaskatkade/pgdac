package demo4;

public class Main {
    public static void main(String[] args) {        
        
        Box<Integer> box1 = new Box<>();
        //Box<Date> box2 = new Box<>();    // Not Ok
        
        Box<Float> box3 = new Box<>();    
        Box<Double> box4 = new Box<>();    
        
        //Box<Boolean> box5 = new Box<>(); 
        //The type Boolean is not a valid substitute for the bounded 
        //parameter <T extends Number> of the type Box<T>   

    }
}
