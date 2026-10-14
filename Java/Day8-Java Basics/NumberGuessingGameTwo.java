import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGameTwo {
    public static void main(String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to guess if it matches or not:");
        int num2 = random.nextInt(1,10);
        int num1;
        int i = 0;
        do{
            num1 = scanner.nextInt();
            if(num1>num2){
                    System.out.println("Number is too high");
                }
            else if(num1<num2){
                    System.out.println("Number is too low");
            }
            else{
                System.out.println("Your number is correct");
                System.out.println("The number of attempts are:"+(i+1));
            }
            i++;
        }while(num1!=num2 && i<5);
        scanner.close();  
}
}