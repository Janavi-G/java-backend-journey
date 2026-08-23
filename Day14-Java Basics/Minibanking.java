import java.util.Scanner;
public class Minibanking {
  static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){
        double balance = 1000.0;
        boolean isRunning = true;
        while(isRunning){
        System.out.println("************Welcome to the Bank*********");
        System.out.println("1.ShowBalance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch(choice){
            case 1-> showBalance(balance);
            case 2-> System.out.println(balance += deposit(balance));
            case 3-> System.out.println(balance -= withdraw(balance));
            case 4 -> isRunning =  quit(isRunning);
            default -> System.out.println("Invalid choice");
        }
    }
    scanner.close();
}
    static void showBalance(double balance){
        System.out.println(balance);
    }
    static double deposit(double amount){
        System.out.println("Enter amount to be deposited");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("Negative amount cant be deposited");
            return 0;
        }
        else{
        return amount;
        }
    }

    static double withdraw(double balance){
      double  withdraw = scanner.nextDouble();
       if(withdraw>balance){
        System.out.println("Insufficient funds");
        return 0;
       }
       else{
        return withdraw;
       }
    }

    static  boolean quit(boolean isRunning){
        System.out.println("Thank you visit again");
        isRunning = false;
        return isRunning;
    } 
}