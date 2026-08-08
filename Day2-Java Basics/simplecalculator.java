import java.util.Scanner;

public class simplecalculator{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to perform simple calculations:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("The sum is :"+(x+y));
        System.out.println("The difference is:"+(x-y));
        System.out.println("The product is:"+(x*y));
        System.out.println("The quotient is:"+(x/y));
        System.out.println("The remainder is:"+(x%y));
        scanner.close();
    }
}