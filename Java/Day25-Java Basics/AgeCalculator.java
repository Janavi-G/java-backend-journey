import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter your date of birth,month and year respectively");
        int date = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.of(year,month,date);

        Period period = Period.between(date1,today);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("You are"+years+"years, "+months+" months "+days+" days old.");
        scanner.close();
    }
}
