package bank;

/*Kesny Raingsey
 * *12/05/2022
 * Semester project for SDEV200
 */
import java.util.Random;


public class Customers extends App {
    private int ID;
    private double balance;

    

    //method to register account 
    //prompt user to enter the information
    public void registerAccount(){
    
        System.out.println("Your account has been created.");
        System.out.println("Account Number is " +getID());
        System.out.println("Your balance is $0.0" );
        

    }
    //method to random ID
    public void randomID (){
        Random rand = new Random();
        ID = 10000000 + rand.nextInt(900000);
    }
    
    public void Contact(){
        System.out.println("Phone number: 317-222-9999");
        System.out.println("Email: Kesny@jave.com");
        System.out.println("Address: 346 Java St, Indinapolis, IN, 46134");
    
    }


    public int getID(){
        randomID();
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }
    

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
