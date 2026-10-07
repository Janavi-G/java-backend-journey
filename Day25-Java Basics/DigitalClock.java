import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DigitalClock {
    public static void main(String []args){
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String time2 = time.format(formatter);
            System.out.println(time2);

    }
}
