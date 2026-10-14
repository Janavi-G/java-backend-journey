import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class BirthdayCalculator {
    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter year ,month and day of birth seperately");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        DateTimeFormatter dformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String newDateTime = date.format(dformatter);
        System.out.println(newDateTime);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        scanner.close();
    }
}