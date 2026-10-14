import java.util.Scanner;
public class whileloops2{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game");

        scanner.close();
    }
}