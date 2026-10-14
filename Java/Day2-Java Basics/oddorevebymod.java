import java.util.Scanner;
public class oddorevebymod {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is odd or even");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("The given number is said to be even");
        }
        else if(num%2!=0){
            System.out.println("The given number is said to be odd");
        }
        else{
            System.out.println("The given number is said to be zero");
        }
        scanner.close();
        }
    }