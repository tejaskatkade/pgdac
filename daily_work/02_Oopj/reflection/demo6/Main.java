package demo6;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

       Class<?> c = Thread.class;
       Constructor<?>[] constructors = c.getConstructors();

       for (Constructor<?> constructor : constructors) {
        System.out.println(constructor);
       }


       
    }
}
