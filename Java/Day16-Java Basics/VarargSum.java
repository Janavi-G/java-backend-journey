import java.util.Scanner;
public class VarargSum {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(add(10,20,30,40,50));
        scanner.close();
    }
    static int add(int...adds){
        int sum = 0;
        for(int sums:adds){
            sum += sums;
            
        } 
        return sum; 
    }
}