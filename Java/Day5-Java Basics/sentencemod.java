import java.util.Scanner;
public class sentencemod {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  line:");
        String sentence = scanner.nextLine();
        int length = sentence.length();
        String newSentence = sentence.replace('a','b');
        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();

        System.out.println("Length is:"+length);
        System.out.println("Replace new sentence:"+newSentence);
        System.out.println("Upper case:"+upperCase);
        System.out.println("Lower case:"+lowerCase);
        scanner.close();
    }
}