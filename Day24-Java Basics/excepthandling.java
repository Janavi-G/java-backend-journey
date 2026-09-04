import java.util.InputMismatchException;
import java.util.Scanner;
public class excepthandling {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';double x=0;double y = 0;
        try{
        System.out.println("Enter first number:");
        x = scanner.nextDouble();
        System.out.println("Enter second number:");
        y = scanner.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("User entered a text instead of number");
            scanner.next();
        }
        try{
            System.out.println("Enter operation +-*/:");
             ch = scanner.next().charAt(0);
        }
        catch(InputMismatchException e ){
            System.out.println("Invalid operation");
        }
        try{
        switch(ch){
            case '+' -> System.out.println(x + y);
            case '-' -> System.out.println(x - y);
            case '*' -> System.out.println(x * y);
            case '/' -> {
                            if(y==0){
                                System.out.println("Cannot divide by zero");
                            }   
                            else{
                                System.out.println(x / y);
                            } 
                        }
            default ->System.out.println("Invalid choice");
        }
    }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        scanner.close();
    }
}