import java.util.Scanner;
public class Countdown{
    public static void main(String[]args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many seconds to coundown from?:");
        int start = scanner.nextInt();
        // for loop = to execute some code a certain amount of times
        for(int i = start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year");
        scanner.close();
    }
}