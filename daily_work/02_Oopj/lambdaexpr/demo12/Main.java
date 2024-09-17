package demo12;

import java.util.function.Consumer;

public class Main {

    public static void Print(Consumer<String> c, String str){
        c.accept(str);
    }

    public static void main(String[] args) {
        
        //Consumer<String> consumer = str -> System.out.println(str);
        //consumer.accept("Good Morning");

        //Main.Print();
        
        Main.Print(str -> System.out.println(str),
                "Hey, Good Morning"
                  );

    }
}
