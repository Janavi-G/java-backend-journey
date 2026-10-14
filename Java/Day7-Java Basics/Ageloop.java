import java.util.Scanner;
public class Ageloop{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int age= 0;
        System.out.println("Enter your age:");
        age = scanner.nextInt();

        while(age<0){
            System.out.println("Your age can't be negative");
            System.out.println("ENter your age again :");
            age = scanner.nextInt();
        }
        System.out.println("You are "+age+" years old");
        scanner.close();
    }
}