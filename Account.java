import java.time.*;
import java.util.Date;

class Account {
    private int accountNumber;
    private int routingNumber;
    private double balance;
    private Customer customer;
    private Date date;

    public Account() {
    }

    public Account(int accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.routingNumber = 11223344;
        this.balance = 0.0;
        this.customer = customer;
        this.date = new Date();
    }

    // make withdrawal and make deposit.
    public void withdrawal(double amount){
        if (this.balance < amount){
            System.out.println("Insufficient funds: " + this.balance + " available.");
        } else {
            this.balance = this.balance - amount;
            System.out.println("Receipt: account balance is " + this.balance + ".");
        }
    }


    public void deposit(double amount){
        this. balance = this.balance + amount;
    }


    //Getter and setter methods to interact with the private fields of the class.
    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Account number: " + this.accountNumber + ", Routing number: " + this.routingNumber + ", Balance: " + this.balance
                + this.getCustomer() + ", Date created: " + this.date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}