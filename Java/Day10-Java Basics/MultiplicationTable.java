import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for its multiplication table");
        int n = scanner.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        scanner.close();
    }
}