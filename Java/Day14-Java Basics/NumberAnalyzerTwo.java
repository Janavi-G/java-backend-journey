import java.util.Scanner;
public class NumberAnalyzerTwo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even,positve or prime");
        int num = scanner.nextInt();
        boolean even = isEven(num);
        boolean positive = isPositive(num);
        boolean Prime = isPrime(num); 
        System.out.println("Even "+ even);
        System.out.println("positive "+ positive);
        System.out.println("Prime "+ Prime);
        scanner.close();     
    }
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean isPositive(int n){
        if(n>0){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean isPrime(int n){
        if(n%2!=0){
            return true;
        }
        else{
            return false;
        }
    }
}