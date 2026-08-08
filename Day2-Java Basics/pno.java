import java.util.Scanner;
public class pno{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is positive,negative or zero");
        double num = scanner.nextDouble();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
        scanner.close();
    }
}