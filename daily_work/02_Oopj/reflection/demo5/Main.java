package demo5;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Class<?> c = Thread.class;
        //Field[] fields = c.getDeclaredFields();
        Field[] fields = c.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
