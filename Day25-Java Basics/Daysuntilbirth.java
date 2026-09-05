import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class Daysuntilbirth {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter birth month and day of yours respectively");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = 2027;
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(year,month,day);

        long days = ChronoUnit.DAYS.between(date, date2);
        System.out.println("No.of days left is "+days);
        scanner.close();
    }
}