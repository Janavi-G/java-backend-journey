import java.util.Scanner;
public class emailextract {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email to extract username from it");
        String email = scanner.nextLine();
        String username = email.substring(0,email.indexOf('@'));
        System.out.println("The username is:"+username); 
        scanner.close();
    }
}
