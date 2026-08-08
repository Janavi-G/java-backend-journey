import java.util.Scanner;
public class Temperatureconverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to convert from fahrenheit to celsius or celsius to fahrenheit:");
        double degree = scanner.nextDouble();
        System.out.println("Enter 'C' for Fahrenheit to celsius else 'F' for celsius to Fahrenheit:");
        String letter = scanner.next();
        double fahrenheit = (degree*9.0/5.0)+32.0;
        double celsius = (degree*5.0/9.0)-32.0;
        if(letter.equalsIgnoreCase("c")){
            System.out.println("The celsius degree is:"+celsius);
        }
        else{
            System.out.println("THe farenheit degree is:"+fahrenheit);
        }
        scanner.close();
    }
}