import java.util.Scanner;
public class TinyCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for calculation:");
        int a = scanner.nextInt();
        System.out.println("Enter 1.Addition");
        System.out.println("Enter 2.Subtract");
        System.out.println("Enter 3.Multiply");
        System.out.println("Enter 4.Divide");
        System.out.println("Enter your choice");
        char choice = scanner.next().charAt(0);
        System.out.println("Enter the second number for calculation");
        int b = scanner.nextInt();
        switch(choice){
            case '1' -> System.out.println(a+b);
            case '2' -> System.out.println(a-b);
            case '3' -> System.out.println(a*b);
            case '4' -> System.out.println(a/b);
            // default ->
            // System.out.println("Invalid choice");
        }
        scanner.close();
    }
}