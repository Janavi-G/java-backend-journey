import java.util.Scanner;
public class TemperatureConverterRebuild {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree to convert from Celsius to Fahrenheit or vice versa:");
        double degree = scanner.nextDouble();
        System.out.print("Enter 'c' for celsius and 'f' for fahrenheit:");
        String choice = scanner.next();
        choice = choice.toUpperCase();
        double cdegree = (degree-32)*5.0/9.0;
        double fdegree = (degree*9.0/5.0)+32;
        switch(choice){
            case "C" -> System.out.printf("The celsius degree is:%f°C",cdegree);
            case "F" -> System.out.printf("The fahrenheit degree is:%f°F",fdegree);
            default -> System.out.println("Invalid choice");
        }
        scanner.close();
    }
}