import java.util.Scanner;
    public class SumofNumbers {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to add till user enters 0");
            int num=1,sum=0;
            while(num!=0){
                num = scanner.nextInt();
                sum += num;
            }
            System.out.println(sum);
            scanner.close();
        }
}