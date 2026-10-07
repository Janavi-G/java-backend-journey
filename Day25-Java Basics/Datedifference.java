import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Datedifference{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dates,month and year  and respectively");
        int date1  = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();
        LocalDate dates1 = LocalDate.of(year1,month1,date1);
         System.out.println("Enter second dates,month and year  and respectively");
        int date2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();
        LocalDate dates2 = LocalDate.of(year2,month2,date2);
        long days = ChronoUnit.DAYS.between(dates1, dates2);
        System.out.println("No. of days differed is:"+days);
        scanner.close();
    }
}