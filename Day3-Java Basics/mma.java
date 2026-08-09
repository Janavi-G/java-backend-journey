import java.util.Scanner;
public class mma {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find max,min and absolute difference");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double max = Math.max(num1,num2);
        double min = Math.min(num1,num2);
        double abs = Math.abs(num1-num2);

        System.out.println("The maximum of two numbers is :"+max);
        System.out.println("The minimum of two numbers is :"+min);
        System.out.println("The absolute  difference of two numbers is :"+abs);
            sc.close();
    }
}