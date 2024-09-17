package demo7;

import java.lang.reflect.Field;

public class Program {
    public static void main(String[] args) {
        Complex complex = new Complex();

        System.out.println("Real : "+ complex.getReal());
        System.out.println("imaginary : "+ complex.getImag());


        Class<?> c = Complex.class;

        Field field = null;

        try{

            field = c.getDeclaredField("real");
            field.setAccessible(true);
            field.setInt(complex, 20);

            field = c.getDeclaredField("imag");
            field.setAccessible(true);
            field.setInt(complex, 30);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Real : "+ complex.getReal());
        System.out.println("imaginary : "+ complex.getImag());
    }
}
