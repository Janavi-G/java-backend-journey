import java.util.Scanner;
public class ATMsimulation {
    static Scanner scanner = new Scanner(System.in);    
    public static void main(String[] args){
    System.out.println("*****************");
    System.out.println("Welcome to the ATM");
    System.out.println("*****************");
    boolean isRunning = true;
    double balance=1000.0;
    int choice;
    do{
    System.out.println("1.Check Balance");
    System.out.println("2.Deposit");
    System.out.println("3.Withdraw");  
    System.out.println("4.Exit");
    System.out.println("Enter your choice");
    choice = scanner.nextInt(); 

    switch(choice){
        case 1 -> System.out.println("The balance is"+balance);
        case 2->balance = deposit(balance);
        case 3 -> balance = withdraw(balance);
        case 4 -> isRunning = exit(isRunning);
        default -> System.out.println("Invalid choice");
    } 
    }while(isRunning);
    System.out.println("See you the other time!");
}
    static double deposit(double balance){
        System.out.println("Enter the amount to be deposited");
        double deposit = scanner.nextDouble();
        if(deposit<0){
            System.out.println("Negative amount cannot be deposited");
        }else{
            balance+=deposit;
            System.out.println("New balance is"+balance);
        }
        return balance;
    }
    static double withdraw(double balance){
        System.out.println("Enter the amount to withdraw");
        double withdraw = scanner.nextDouble();
        if(withdraw>balance){
            System.out.println("Withdraw amount cannot be greater than balance");
        }else{
            balance-=withdraw;
            System.out.println("The amount with balance is"+balance);
        }
        return balance;
    }
    static boolean exit(boolean isRunning){
        System.out.println("**********************");
        System.out.println("Thank you visit again");
        System.out.println("**********************");
         isRunning = false;
    return isRunning;
    }
}