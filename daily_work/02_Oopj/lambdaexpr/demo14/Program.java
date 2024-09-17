package demo14;

import java.util.function.BiFunction;;

public class Program {

    public static void main(String[] args) {
        
        BiFunction<Integer, Integer, Integer> bf = Integer::sum;
        System.out.println("The sum is : "+ bf.apply(10,10));
        
    }
    
}
