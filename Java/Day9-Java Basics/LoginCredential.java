import java.util.Scanner;
public class LoginCredential {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "Janavi";
        String correctPassword = "Janavi@123";
        System.out.println("Enter username and password respectively");
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        if(correctUsername.equals(username)&&correctPassword.equals(password)){
            System.out.println("You have logged in");
        }
        else{
            System.out.println("Please enter valid credentials to login");
        }
        scanner.close();
    }
}