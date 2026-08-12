import java.util.Scanner;
public class EnhancedSwitches {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        //Enhanced switches = A replacement to many else if statements
        //It is a Java-14 feature.
        System.out.println("Enter a day of the week");
        String day = scanner.nextLine();

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> 
            System.out.println("It is a weekday");
            case "Saturday","Sunday" -> 
            System.out.println("It is a weekend");
            default -> System.out.println(day+" is not a day");
        }
        scanner.close();
    }   
}