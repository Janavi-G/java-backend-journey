import java.util.Scanner;
public class SumNumbers {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to print numbers till then:");
            int num = scanner.nextInt();
            int sum = 0;
            for(int i = 1;i<=num;i++){
                
                sum += i;
                System.out.println(sum);
            }
            scanner.close();
        }
}