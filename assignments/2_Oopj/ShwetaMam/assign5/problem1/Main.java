package assign5.problem1;

/***
 * 1) Create a base class BankAccount with methods like deposit() and
 * withdraw(). Derive a class SavingsAccount that overrides the withdraw(
 * method to impose a limit on the withdrawal amount. Write a program that
 * demonstrates the use of overridden methods and proper access modifiers
 * return the details.
 */

public class Main {

    public static void main(String[] args) {
        BankAccount acc = new SavingAccount();
        System.out.println(acc);
        
        BankAccount acc1 = new SavingAccount();
        System.out.println(acc1);
        
        BankAccount acc2 = new SavingAccount();
        System.out.println(acc2);
        
        BankAccount acc3 = new SavingAccount();
        System.out.println(acc3);

        System.out.println("::;;;;;;;;;;;;;;;;;;");

        acc.deposit(10000);
        acc3.deposit(25000);

        System.out.println(acc);
        System.out.println(acc3);

        System.out.println("Withdrawal Amount "+acc.withdraw(5000));
        System.out.println(acc);

        
        System.out.println("Withdrawal Amount "+acc3.withdraw(21000));
        System.out.println(acc3);

    }
}
