import java.util.Scanner;
public class CI{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest in %:");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the number of times compoounded per year:");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the number of years:");
        years = scanner.nextInt();

        amount = principal *Math.pow((1+rate/timeCompounded),(timeCompounded*years));

        System.out.printf("The amount after %d is:$  %,.2f",years,amount);
        scanner.close();
    }
}