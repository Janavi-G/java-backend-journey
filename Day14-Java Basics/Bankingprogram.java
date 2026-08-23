import java.util.Scanner;
public class Bankingprogram {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String []args){
        //declare variables
         
        double balance=100.0;
        boolean isRunning = true;
        int choice;
        while(isRunning){
            System.out.println("****************");
        System.out.println("Banking program");
        System.out.println("****************");
        System.out.println("1. Show balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("****************");
        //get and process users choice
        System.out.print("Enter your choice");
        choice = scanner.nextInt();
        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid choice");
        }
        }
        System.out.println("***************************");
        System.out.println("Thank you have a nice day");
        System.out.println("***************************");
        scanner.close();
        //show balance()
        //deposit
        //withdraw
        //exit message
    }
    static void showBalance(double balance){
        System.out.println("*******************");
        System.out.printf("$%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter an amount to be deposited");
        
        amount = scanner.nextDouble();
        if(amount <0){
            System.out.println("Amount cant be negative");
            return 0;
        }
        else{
            return amount;
        }
           // return 0;        
    }
    static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to be withdrawn");
        amount = scanner.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else if(amount<0){
            System.out.println("Amount cant be negative");
            return 0;
        }
        else{
        return amount;      
     }
        // return 0;
    }
}