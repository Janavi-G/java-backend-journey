import java.util.Scanner;
public class extract {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name to get first and last name");
        String name = scanner.nextLine();
        int trim = name.indexOf(" ");
        String firstName = name.substring(0,trim);
        String lastName = name.substring(trim+1,name.length());
        System.out.println("The firstname is: "+firstName+" the lastname is: "+lastName);
        scanner.close();
    }
}