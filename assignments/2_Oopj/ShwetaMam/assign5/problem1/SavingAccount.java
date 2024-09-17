package assign5.problem1;

public class SavingAccount extends BankAccount{
    private int accountNum;
    static int counter = 1000;

    public SavingAccount(){
        SavingAccount.counter = counter + 1;
        this.accountNum = counter; 
    }

    @Override
    public float withdraw(float amount){
        if(amount > 20000){
            System.out.println("Withdrawal Failed...");
            System.out.println("Withdrawal Limit is 20,000 ");
        }else if(amount > this.balance){
            System.out.println("Insufficient bank balance....");
            System.out.println("Your Bank balance is : "+this.balance);
        }else{
            System.out.println("Withdrawal succeful..");
            this.balance = this.balance - amount;
            System.out.println("Your remaining balance is : "+ this.balance);
            return amount;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "SavingAccount [accountNum=" + accountNum + ", balance=" + balance + "]";
    }

}
