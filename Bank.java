package Abstracts;

public class Bank {
    public static void main(String[] args) {
        System.out.println("SAVINGS ACCOUNT");
        BankAccount account = new savingsAccount("Aylin");
        account.openAccount();
        account.printInfo();
        account.deposit(500);
        account.balance();

        System.out.println("-----------------");

        System.out.println("BUSINESS ACCOUNT");
        BankAccount account1 = new BusinessAccount("Aylin");
        account1.openAccount();
        account1.printInfo();
        account1.deposit(500);
        account1.balance();
    }
}



abstract class BankAccount{
    String accountHolder;
    BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    Double balance;


    abstract void openAccount();
    abstract void deposit(double amount);
    abstract void balance();

    void printInfo() {
       System.out.println("Account holder: " + this.accountHolder);
       System.out.println("Account balance: " + this.balance);
    }
}



class savingsAccount extends BankAccount{
    double balance = 0;
    savingsAccount(String accountHolder){
        super(accountHolder);
    }


    @Override
    void openAccount() {
        System.out.println("New account opened");
    }


    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Replenished: " + amount);
    }

    @Override
    void balance() {
        System.out.println("Your balance now: " + balance);
    }
}




class  BusinessAccount extends BankAccount{
    double balance = 0;
    BusinessAccount(String accountHolder){
        super(accountHolder);
    }


    @Override
    void openAccount() {
        System.out.println("New account opened");
    }



    @Override
    void deposit(double amount) {
        balance = amount * 0.98;
        System.out.println("Replenished: " + amount);
    }


    @Override
    void balance() {
        System.out.println("Your balance now: " + balance);
    }
}