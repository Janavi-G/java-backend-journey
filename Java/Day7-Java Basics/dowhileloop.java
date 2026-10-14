
import java.util.Scanner;
public class dowhileloop {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number<1 || number >10){
            System.out.println("Enter a number between 1 -10:");
            number = scanner.nextInt();
        }
        System.out.println("You picked the number:"+number);
        scanner.close();
    }
}