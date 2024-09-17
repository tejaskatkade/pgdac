package assign5.problem1;

public class BankAccount {
    //private float balance;
    protected float balance;
    
    public void deposit(float newBalance){
        this.balance = this.balance + newBalance;
    }

    public float withdraw(float amount){
        if(amount > this.balance){
            System.out.println("Insufficient bank balance....");
            System.out.println("Your Bank balance is : "+this.balance);
            //return this.balance;
        }else{
            System.out.println("Withdrawal succeful..");
            this.balance = this.balance - amount;
            System.out.println("Your remaining balance is : "+ this.balance);
            return amount;
        }
        return 0;
    }
}
