import java.util.Scanner;
public class sdf{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name,age and percentage accordingly");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double pert = scanner.nextDouble();
        System.out.printf("Your name is %s,and you are %d old.You have earned a %f percentage",name,age,pert);
        scanner.close();
    }
}