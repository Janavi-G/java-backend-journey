import java.util.Scanner;
public class PositiveNumbers{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers to check if it is positive or not");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a >0 && b >0 && c >0){
            System.out.println("All are positive numbers");
        }
        else{
            System.out.println("There is/are missing positive number/s");
        }
        scanner.close();
    }
}