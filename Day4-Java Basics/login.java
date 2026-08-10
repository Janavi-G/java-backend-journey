import java.util.Scanner;
public class login {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String username ="Janavi";
        String password="JaNaVi@1";
        String username1;
        String password1;
        System.out.print("Enter the username to login:");
        username1 = scanner.nextLine();
        if(username1.equals(username)){
            System.out.print("The username is correct,please enter the password:");
            password1 = scanner.nextLine();
            if(password1.equals(password)){
                System.out.println("The password is correct");
                System.out.println("*****LOGIN SUCCESSFUL*****");
            }
            else{
                System.out.println("The password is incorrect,try again.");
            }
            }
        else{
            System.out.println("The username is incorrect.");
        }
        scanner.close();
    }
}