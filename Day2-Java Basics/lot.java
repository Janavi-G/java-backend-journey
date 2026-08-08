import java.util.Scanner;
public class lot {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers to check the largest");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if(num1>num2){
            System.out.println("The number "+num1+" is greatest");
        }
        else{
            System.out.println("The number "+num2+" is the greatest");
        }
        scanner.close();
    }
}