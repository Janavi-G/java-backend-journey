import java.util.Scanner;

public class username {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name and last name seperately:");
        String fname = scanner.nextLine().trim();
        String lname = scanner.nextLine().trim();
        String username =fname+"."+lname;
        username = username.toLowerCase();

        System.out.println("The username of the given name is : "+username);
        scanner.close();
    }
}