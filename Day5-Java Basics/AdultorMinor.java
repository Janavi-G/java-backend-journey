import java.util.Scanner;
public class AdultorMinor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age to identify as adult or minor");
        int age = scanner.nextInt();
        String output = (age>=18)? "You are an Adult" :"You are a Minor";
        System.out.println(output);
        scanner.close();
    }
}