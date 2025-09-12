package FileReader;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileReaderHw {
    public static void main(String[] args) {
        Account account = new Account();
        account.start();
        File file = new File("C:/Users/aylin/OneDrive/Desktop/java");
        System.out.println("file directory: " + file.isDirectory());
        System.out.println("is file or not? : " + file.isFile());
        System.out.println("storage: " + file.length());
        System.out.println("last modified: " + file.lastModified());
        System.out.println("get name: " + file.getName());
    }
}


class Account{
    String owner = "Aylin";
    double balance;
    String WantToDeposit;
    double deposit;
    String WantToWithdraw;
    double withdraw;

    void start() {
        Amount amount = new Amount();
        amount.display();
    }

    class Amount {
        void display(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome back, " + owner);
            System.out.println("Your balance is " + balance);

            System.out.println("Do you want to deposit some money? (yes/no): ");
            String WantToDeposit = scanner.nextLine().toLowerCase();

            if(WantToDeposit.equals("yes")){

                System.out.println("Enter your deposit amount: ");
                Double deposit = scanner.nextDouble();
                scanner.nextLine();
                balance += deposit;
                System.out.println("Your current balance is: " + balance);

            } else if (WantToDeposit.equals("no")){

                System.out.println("No changes happened with your balance");
                System.out.println("Your current balance is: " + balance);

            } else{

                System.out.println("Invalid answer. Please type 'yes' or 'no'");

            }


            System.out.println("Do you want to withraw some money? (yes/no): ");
            String WantToWithdraw = scanner.nextLine().toLowerCase();

            if(WantToWithdraw.equals("yes")){
                System.out.println("Enter your withdrawal amount: ");
                double withdraw = scanner.nextDouble();


                try {
                    if (withdraw > balance) {
                        System.out.println("Unfortunately, you don't have that much money on your balance.");
                    } else {
                        balance -= withdraw;
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }


                System.out.println("Your current balance is: " + balance);
            } else if (WantToWithdraw.equals("no")){
                System.out.println("No changes happened with your balance");
                System.out.println("Your current balance is: " + balance);
            } else{
                System.out.println("Invalid answer. Please type 'yes' or 'no'");
            }
        }
    }
}