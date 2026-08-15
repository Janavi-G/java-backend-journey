import java.util.Scanner;
public class Login {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       String correctUsername = "Janavi";
       String correctPassword = "Janavi@123";
       System.out.println("Enter the username and password");
       String username = scanner.nextLine();
       String password = scanner.nextLine();
       if(username.equals(correctUsername) && password.equals(correctPassword)){
        System.out.println("The username and password is matched!");
       }
       else{
        System.out.println("The username and password is not matched!");
       }
       scanner.close();
    }
}