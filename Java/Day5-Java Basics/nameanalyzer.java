import java.util.Scanner;
public class nameanalyzer {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name to analyze:");
        String name = scanner.nextLine();
        int length = name.length();
        char f = name.charAt(0);
        char l = name.charAt(length-1);
        int pos = name.indexOf("a");//Java is case-sensitive here.It gives -1 if the string is JANAVI(which means there is no 'a' in JANAVI).
        String upp = name.toUpperCase();
        String low  = name.toLowerCase();
        System.out.println("Length:"+length);
        System.out.println("first character:"+f);
        System.out.println("last character:"+l);
        System.out.println("Position of a character:"+pos);
        System.out.println("Name in uppercase:"+upp);
        System.out.println("Name in lowercase:"+low);
        scanner.close();
    }
}