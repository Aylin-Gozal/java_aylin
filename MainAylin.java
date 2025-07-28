package AylinBank;

import java.sql.SQLOutput;

public class MainAylin {
    public static void main(String[] args) {
        BankAccount [] accounts = {
            new SavingsAccount(),
            new CheckingAccount(),
            new BusinessAccount(),
        };


        for (BankAccount acc : accounts){
            acc.accType();
            System.out.println("----------------");
            acc.deposit(1000);
            acc.withdraw(300);
            System.out.println("Your current balance: " + acc.balance);
            System.out.println("----------------------------");
        }
    }
}



class BankAccount {
    double balance;



    void withdraw(double amount){
        balance -= amount;
        System.out.println("Снятие: " + amount);
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    void accType(){
        System.out.println("account type: ");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal from a Savings Account: " + amount);
    }


    @Override
    void accType() {
        System.out.println("Savings Account");
    }
}


class CheckingAccount extends BankAccount{
    @Override
    void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawal from a Checking account: " + amount);
    }

    @Override
    void accType() {
        System.out.println("Checking Account");
    }

}


class BusinessAccount extends BankAccount{
    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal from a Business account: " + amount);
    }

    @Override
    void accType() {
        System.out.println("Business Account");
    }
}
