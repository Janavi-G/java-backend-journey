import java.time.Duration;
import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Timedifference {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start time HH:mm:ss");
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();

        System.out.println("Enter end time HH:mm:ss");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();

        LocalTime time1 = LocalTime.of(hours1,minutes1);
        LocalTime time2 = LocalTime.of(hours2,minutes2);
        Duration drtn = Duration.between(time1,time2);
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH hours :mm minutes");
        // String diff = drtn.format(formatter);
        System.out.println("Difference:"+drtn);
        scanner.close();
    }
}