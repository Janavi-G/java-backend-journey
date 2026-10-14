import java.util.Scanner;
import java.util.Random;
public class NGGThree {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1 = random.nextInt(1,11);
        System.out.println("Enter a number for guessing game");
        int i = 0,num2=0;
        while(i<5 && num1!=num2){
            num2 = scanner.nextInt();
            if(num1>num2){
            System.out.println("Number is too low");   
            }
            else if(num1<num2){
            System.out.println("Number is too high");   
            }
            else{
                System.out.println("The number matches");
            }
            i++;
        }
        if(num1 != num2) {
        System.out.println("You ran out of attempts.");
        System.out.println("The correct number was: " + num1);
        scanner.close();
    }
}
}