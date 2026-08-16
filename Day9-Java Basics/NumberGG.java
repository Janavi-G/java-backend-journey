import java.util.Scanner;
import java.util.Random;
    public class NumberGG {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Enter a number to start guessing");
            int num1=0;
            int num2 = random.nextInt(1,11);
            int i = 0;
            while(num1!=num2 && i<5){
                num1 = scanner.nextInt();
                if(num1<num2){
                    System.out.println("Too low");
                }
                else if(num1>num2){
                    System.out.println("Too high");
                }
                else{
                    System.out.println("It is a correct match");
                }
                i++;
            }
            if(num1!=num2){
                System.out.println("It is not a correct match");
                System.out.println("Correct match number is:"+num2);
            }
            scanner.close();
        }
}