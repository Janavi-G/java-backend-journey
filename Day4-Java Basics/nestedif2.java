import java.util.Scanner;
public class nestedif2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timeCompounded;
        int years;

        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest in percentage:");
        rate = scanner.nextDouble() /100;
        System.out.print("Enter the timeCompounded per year:");
        timeCompounded = scanner.nextInt();
        System.out.print("Enter the number of years:");
        years = scanner.nextInt();

        double amount = principal *Math.pow((1+rate/timeCompounded),timeCompounded*years);

        System.out.printf("The amount of compound interest for %d years is:$ %,.2f",years,amount);
        scanner.close();
    }
}