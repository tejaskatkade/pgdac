package demo8;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // boolean	test(T t)
        
        //Predicate<Integer> p = (Integer num) -> num %2 == 0;
        
        //Predicate<Integer> p = (num) -> num %2 == 0;
        
        Predicate<Integer> p = num -> num %2 == 0;

        System.out.println("The number is even : "+ p.test(41) );
    }
}
