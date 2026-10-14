import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Validator{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        try{
        System.out.println("Enter an index");
        int n = scanner.nextInt();
        System.out.println(list.get(n));
        }
        catch(InputMismatchException e){
            System.out.println("Please enter number instead of text");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        scanner.close();
    }
}