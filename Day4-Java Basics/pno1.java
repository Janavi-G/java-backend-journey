import java.util.Scanner;
public class pno1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is positive or negative or zero ,and even or odd if positive:");
        double num = scanner.nextDouble();
        if(num>0){
            System.out.println("The given number is positive");
            if(num%2==0){
                System.out.println("The given number is positive and even");
            }
            else{
                System.out.println("The given number is positive and odd");
            }
        }
        else if(num<0){
            System.out.println("The given number is negative");
        }
        else{
            System.out.println("The given number is zero");
        }
        scanner.close();
    }
}