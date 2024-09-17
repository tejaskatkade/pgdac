package demo8;

import java.util.Scanner;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter class name "); //demo8.Calculator
            String className = sc.nextLine();
            Class<?> name = Class.forName(className);

            System.out.println("Enter method name");
            String method = sc.nextLine();  // sub

            Method[] methods = name.getDeclaredMethods();

            for (Method method2 : methods) {
                if (method.equals(method2.getName())) {
                    Parameter[] p = method2.getParameters();

                    Object[] parameter = new Object[p.length];

                    for (int i = 0; i < p.length; i++) {
                        String pType = p[i].getType().getName();
                        System.out.println("Enter value for "+pType+" parameter  : ");
                        parameter[i] = Convert.changeType(pType, sc.nextLine());
                    }

                    Object reference = name.newInstance();
                    System.out.println(method2.invoke(reference, parameter));
                    break;
                }
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
