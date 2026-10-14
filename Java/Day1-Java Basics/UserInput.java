import java.util.Scanner;
public class UserInput {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Enter your gpa:");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a student ,(true or false):");
        boolean isStudent = scanner.nextBoolean();
////////////////////////////////////////////////////////////////////////////////
        System.out.println("Hello "+name);
        System.out.println("Your are"+age+"Years old");
        System.out.println("Your gpa is :"+gpa);
        if (isStudent){
            System.out.println("You are enrolled as student");
        }
        else{
            System.out.println("You are not enrolled as student");
        }
        System.out.println("Student:"+isStudent);
        scanner.close();
    }
}