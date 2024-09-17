package demo9;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // void	accept(T t)
        
        //Consumer<String> c = (str)->System.out.println(str);
        Consumer<String> c = str->System.out.println(str);
        
        c.accept("Tejas katkade");
    }
}
