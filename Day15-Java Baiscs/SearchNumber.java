import java.util.Scanner;
public class SearchNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if present in array or not");
        int num1 = scanner.nextInt();
        int i=0;boolean found = false;
        int[] num2 = {10,20,30,40,50,60,70,80,90,100};
        while(i<num2.length){
            if(num1==num2[i]){
                found = true;
                 break;
            }
            i++;
        }
        if(found){
            System.out.println(num1 + " is present in the array.");
        }
        else{
            System.out.println(num1 + " is not present in the array.");
        }
        // System.out.println( "The number is present in the array" + found);
        scanner.close();
    }
}