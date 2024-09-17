package demo10;

import java.util.function.Supplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // T get()
        
        Supplier<Integer> s = ()-> new Random().nextInt();
        System.out.println(s.get());
    
    }
}
