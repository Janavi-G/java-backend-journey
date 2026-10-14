import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleExceptions {
    public static void main(String []args){
        int n1=1,n2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        try{
        n1 = scanner.nextInt();
        System.out.println("Enter second number:");
        n2 = scanner.nextInt();
        if(n2 == 0){
            System.out.println("division by zero not possible");
        }
        else{
            System.out.println("The division is "+(n1/n2));
        }
    }
    catch(InputMismatchException e){
            System.out.println("Enter number instead of text");
        }
        
    catch(Exception e){
        System.out.println("Something went wrong");
        }
        // scanner.close();
        scanner.close();
    }
}