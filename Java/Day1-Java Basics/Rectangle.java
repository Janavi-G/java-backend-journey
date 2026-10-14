import java.util.Scanner;

public class Rectangle{
    public static void main(String [] args){
        double width= 0.0;
        double height = 0.0;
        double area = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width:");
        width = scanner.nextDouble();
        System.out.print("Enter the height:");
        height = scanner.nextDouble();
        
        area = height *width;

        System.out.println("The area of rectangle is:"+area+"cm²");
        scanner.close();  
    }
}