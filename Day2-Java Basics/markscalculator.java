import java.util.Scanner;
public class markscalculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of following subjects to getr total and percentage:");
        System.out.print("Enter the marks of Math:");
        int math = scanner.nextInt();
        System.out.print("Enter the marks of Social Studies:");
        int social = scanner.nextInt();
        System.out.print("Enter the marks of English:");
        int english = scanner.nextInt();
        System.out.print("Enter the marks of Science:");
        int science = scanner.nextInt();
        System.out.print("Enter the marks of Computer Science:");
        int cs = scanner.nextInt();

        double total = math+science+english+social+cs;
        double percentage = (total/500)*100;

        System.out.println("The total marks obtained for 500 is:"+total);
        System.out.println("THe percentage of the makrs obtained is:"+percentage+"%");
        scanner.close();
    } 
}