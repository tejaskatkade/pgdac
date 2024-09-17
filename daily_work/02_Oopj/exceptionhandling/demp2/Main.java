package exceptionhandling.demp2;

import java.util.Scanner;

import exceptionhandling.demp2.collection.StackDemo;
import exceptionhandling.demp2.exception.StackOverFlowException;
import exceptionhandling.demp2.exception.StackUnderFlowException;

public class Main {
    
    static Scanner sc = new Scanner(System.in);

    public static int menuList(){
        System.out.println("0. Exit");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.print("Select Option :  ");
        return sc.nextInt();
    }

    public static void main1(String[] args) {
        int choice;
        StackDemo stack = new StackDemo();
        while ((choice = menuList()) != 0) {
            try{
                switch (choice) {
                    case 1:
                        stack.push(sc);
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        stack.peek();
                        break;
                    default:
                        System.out.println("wrong choice");
                        break;
                }
            }catch(StackOverFlowException e){
                System.out.println(e.getMessage());
            }catch(StackUnderFlowException e){
                System.out.println(e.getMessage());

            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        int choice;
        StackDemo stack = new StackDemo();
        while ((choice = menuList()) != 0) {
            try{
                switch (choice) {
                    case 1:
                        stack.push(sc);
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        stack.peek();
                        break;
                    default:
                        System.out.println("wrong choice");
                        break;
                }
            }catch(StackOverFlowException | StackUnderFlowException e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

}
