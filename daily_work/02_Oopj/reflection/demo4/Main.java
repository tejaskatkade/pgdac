package demo4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Class<?> c = Thread.class;
        System.out.println(c.getName());            // java.lang.Thread
        System.out.println(c.getSimpleName());      // Thread
        System.out.println(c.getCanonicalName());   // java.lang.Thread
        System.out.println(c.getSuperclass());      // class java.lang.Object


        Class<?> c1 = ArrayList.class; 
        System.out.print("Interfaces [ ");
        Class<?>[] intfs = c1.getInterfaces();
        for(Class<?>  i : intfs){
            System.out.print(i+" | ");
        }
        System.out.println(" ]");
       
    }
}
