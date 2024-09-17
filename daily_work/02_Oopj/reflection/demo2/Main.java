package demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Fully Qualified Class Name : ");
            String className =  sc.nextLine();
            Class<?> c = Class.forName(className);
            //forname -> returns the runtime Class object for the class
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
