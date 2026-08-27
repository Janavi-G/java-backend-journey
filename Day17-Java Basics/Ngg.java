import java.util.Scanner;
import java.util.Random;
public class Ngg {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess a number between 1 to 100");
        int num = 0 ;
        int num2 = random.nextInt(1,101);
        int i=0;
            
        while(num!=num2 && i<7){
            System.out.println("Enter your guess:");
            num = scanner.nextInt();
            i++;
            if(num>num2){
                System.out.println("Too high");
            }
            else if(num<num2){
                System.out.println("Too low");
            }
            else{
                System.out.println("It's a match!");
            }
        }
        System.out.println("The number of attempts made is"+i);
        if(num==num2){
            System.out.println("You guessed it!The number is:"+num);
        }
        else{
            System.out.println("You ran out of attempts");
            System.out.println("The number was:"+num2);
        }
        scanner.close();
    }
}