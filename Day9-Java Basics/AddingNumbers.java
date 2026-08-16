import java.util.Scanner;
    public class AddingNumbers {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to keep adding till 0 as input");
            int sum = 0;
            int num = scanner.nextInt();
            while(num!=0){
                num = scanner.nextInt();
                sum += num;
                System.out.println(sum);
            }
            System.out.println("You have entered zero,so stopped adding");
            scanner.close();
        }
    }