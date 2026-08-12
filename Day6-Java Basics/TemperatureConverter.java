import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature:");
        temp = scanner.nextDouble();
        System.out.println("Convert to Celsius or Fahrenheit?(C or F):");
        unit = scanner.next().toUpperCase();

        
        //(condition)? true :false
        newTemp = (unit.equals("C"))? (temp-32)*5.0/9.0 : (temp*9.0/5.0)+32;
        System.out.printf("%.1f°%s",newTemp,unit);
        scanner.close();
    }
}