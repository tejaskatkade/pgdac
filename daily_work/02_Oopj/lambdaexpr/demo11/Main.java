package demo11;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //R apply(T t)

        //Function<String, Integer> fun1 = (str)-> str.length();
        Function<String, Integer> fun = str-> str.length();

        System.out.println(fun.apply("Tejas"));
        
       
    
    }
}
