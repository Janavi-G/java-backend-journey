import java.util.Scanner;
public class circle {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius of circle:");
        radius = scanner.nextDouble();
        double circumference = 2 *Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.printf("The circumference of circle is: %.1fcm\n",circumference);
        System.out.printf("The area of circle is:%.1fcm²\n",area);
        System.out.printf("The volume of the sphere is: %.1fcm³\n",volume);
        scanner.close();
    }
}