import java.util.Scanner;
public class EmployeeRole {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter role");
        String s = scanner.next();
        Role rl = Role.valueOf(s.toUpperCase());
        System.out.println(rl.getRoles());
        scanner.close();
    }
}