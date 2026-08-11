import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        double num = scanner.nextDouble();

        String output = (num%2==0)? "It is an Even":"It is odd";
        System.out.println(output);
        scanner.close();
    }
}
