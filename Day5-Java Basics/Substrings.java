import java.util.Scanner;
public class Substrings {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // String email = "janavi123@gmail.com";
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        if(email.contains("@")){
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println(username);
        System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }
        scanner.close();
    }
}