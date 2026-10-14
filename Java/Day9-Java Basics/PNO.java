import java.util.Scanner;
public class PNO {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is positive ,negative or zero");
        int num = scanner.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        scanner.close();
    }
}