import java.util.Scanner;
public class NameAnalyzerTwo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name to analyze");
        String name = scanner.nextLine();
        int length = name.length();
        char fname = name.charAt(0);
        char lname = name.charAt(name.length()-1);
        String upp = name.toUpperCase();
        String low = name.toLowerCase();
        int pos = name.indexOf('a');

        System.out.println(length);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(upp);
        System.out.println(low);
        System.out.println(pos);
        scanner.close();
    }
}