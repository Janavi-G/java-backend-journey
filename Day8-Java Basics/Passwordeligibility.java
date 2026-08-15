import java.util.Scanner;
    public class Passwordeligibility {
        public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
            String correctPassword = "Janavi@123";
            System.out.println("Enter the password until it matches");
            String password = scanner.nextLine();
            while(!correctPassword.equals(password)){
                System.out.println("The password doesn't matches");
            password = scanner.nextLine();
            }
            System.out.println("The password matches");
            scanner.close();
        }   
}