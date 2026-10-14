import java.util.Scanner;
public class LogicalOperators2{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check its range:");
        int num = scanner.nextInt();
        if(num >=10 && num <=50){
            System.out.println("The number range is between 10 ad 50");
        }
        else{
            System.out.println("The range of number is greater than 50");
        }
        scanner.close();
    }
}