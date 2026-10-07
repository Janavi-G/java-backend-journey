import java.time.LocalDate;
import java.util.Scanner;
public class Futuredatecalculator{
    public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
   System.out.println("Enter date,month and year,number of days");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int nod = scanner.nextInt();
        LocalDate date2 = LocalDate.of(year,month,day);
        LocalDate date1 = date2.plusDays(nod);
        System.out.println(date1);
    scanner.close();
}
}