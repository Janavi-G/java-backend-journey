// import java.time.Instant;
// import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesandTime {
    public static void main(String []args){
        //How to work with dates and times using java
        //(LocalDate,LocalTime,LocalDateTime,UTC timestamp)
        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        // LocalDateTime datetime = LocalDateTime.now();

        // Instant instant = Instant.now();
        // System.out.println(date);
        // System.out.println(time);
        // System.out.println(instant);
        // System.out.println(datetime);

        //Cutom format

        LocalDateTime datetime = LocalDateTime.now();
         DateTimeFormatter dtformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String newDateTime = datetime.format(dtformatter);
        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2024,12,25,22,11,23);
                LocalDateTime date2 = LocalDateTime.of(2024,1,1,1,0,0);

                if(date1.isBefore(date2)){
                    System.out.println(date1+"Is earlier than "+date2);
                }
                else if(date1.isAfter(date2)){
                    System.out.println(date1+"is later than "+date2);
                }
                else if(date1.isEqual(date2)){
                    System.out.println(date1+"is equal to"+date2);
                }
    }
}