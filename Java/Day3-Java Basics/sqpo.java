import java.util.Scanner;
public class sqpo{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root and power:");
        double num = scanner.nextDouble();
        double sq = Math.sqrt(num);
        double pow = Math.pow(num,2);
        System.out.println("The square root of given number is:"+sq);
        System.out.println("The power of given number is :"+pow);
        scanner.close();
    }
}