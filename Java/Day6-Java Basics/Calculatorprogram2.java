import java.util.Scanner;
public class Calculatorprogram2{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("ENter an operator(+,-,*,/,^):");
        char choice = scanner.next().charAt(0);
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        switch(choice){
            case '+' -> System.out.println(num1+num2);
            case '-' -> System.out.println(num1-num2);
            case '*' -> System.out.println(num1*num2);
            case '/' ->{
                if(num2 == 0){
                    System.out.println("Nothing is divisible by zero");
                }
                else{
                    System.out.println(num1/num2);
                }
            }
            case '^' -> System.out.println(Math.pow(num1,num2));
        }
        scanner.close();
    }
}