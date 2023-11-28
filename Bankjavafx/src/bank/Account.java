package bank;


/*Kesny Raingsey
 * *12/18/2022
 * Semester project for SDEV200
 */

public class Account extends App{

    private double balance;
    
        
    
    //method to check account
    public void checkAccount(double amount){
        System.out.println("Your current balance: " );
       // System.out.println(this.accHolder+ ", your balance is $"+this.balance);
    }

    //method to deposit money
    public void deposit(Integer amount) {
        System.out.println("Deposit is successful, new Balance is $");
    }
    //method to withdraw money
    public void withdraw(double amount) {
        if(this.balance - amount < 0) {
            System.out.println("Withdraw unsuccessful, your current balance is only $" +this.balance );
        }
        else {
            System.out.println("Withdraw successful, Current Balance is $" +this.balance);
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    

  
    
}
