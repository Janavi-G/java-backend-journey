import java.util.Scanner;
public class forlooptwo{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a nuumber max");
        int max = scanner.nextInt();
        for(int i = 1;i<=max;i++){
        System.out.println(i);
        }
        scanner.close();
    }
}