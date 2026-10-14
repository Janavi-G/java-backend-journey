import java.util.Scanner;
public class Rightangle {
    public static void main(String[]args){
        //hypotenuse = c=Math.sqrt(a2 +b2);
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sides of a right angled triangle side A:");
        a = scanner.nextDouble();
        System.out.print("Enter the sides of a right angled triangle side B:");
        b = scanner.nextDouble();
        c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print("The hyppotenuse of the triangle is:"+c+"cm");
        scanner.close();
    }
}