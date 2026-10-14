import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Alarmclock {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\Janu\\OneDrive\\Desktop\\Backend Journey\\Day26-Java Basics\\file_example_WAV_1MG.wav";
        while(alarmTime == null){
        try{
        System.out.println("Enter an alarm time(HH:MM:SS)");
        String inputTime = scanner.nextLine();
        alarmTime = LocalTime.parse(inputTime,formatter);
        System.out.println("Alarm set for"+alarmTime);
    }
    catch(DateTimeParseException e){
        System.out.println("Invalid Format.Please use HH:MM:SS");
    }
}
    Alarm al = new Alarm(alarmTime,filePath,scanner);
    Thread alarmThread = new Thread(al);
    alarmThread.start();
}
}