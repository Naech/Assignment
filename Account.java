//Account class with a double instance variable
// and deposit method that perform validation.

public class Account{
    private String name; // instance variable
    private double balance; // instance variable

    //Account constructors that receives two parameters
    public Account(String name, double balance){
        this.name = name; //assign name to instance 

        if (balance > 0.0){
            this.balance = balance;
        }
    }

    // method that deposits (adds) only a valid account
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }

    }

    //method that returns the account balance
    public double getBalance(){
        return balance;
    }

    //methods that set the name
    public void setName(String name){
        this.name = name;
    }
    //method that retrieve the name

    public String getName(){
        return name;
    }


}