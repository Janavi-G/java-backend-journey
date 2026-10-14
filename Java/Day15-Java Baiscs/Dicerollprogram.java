import java.util.Scanner;
import java.util.Random;
public class Dicerollprogram {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
         int numofDice;
         int roll;
         int total = 0;
        System.out.println("Enter the number of times the dice to roll");
        numofDice = scanner.nextInt();
        if(numofDice > 0){
        for(int i = 0;i<numofDice;i++){
            roll = random.nextInt(1,7);
            printDice(roll);
            System.out.println("You rolled "+roll);
            total +=roll;
            System.out.println("Total "+total);
        }
    }
    else{
        System.out.println("The dice number must be greater than zero");
    }
        scanner.close();
    }
    static void printDice(int roll){
        String dice1= """
                -------
                |     |
                |  ●  |
                |     |
                -------
                """;
                String dice2= """
                -------
                |●    |
                |  ●  |
                |     |
                -------
                """;
                String dice3= """
                -------
                |●    |
                |  ●  |
                |    ●|
                -------
                """;
                String dice4= """
                -------
                |●   ●|
                |     |
                |●   ●|
                -------
                """;
                String dice5= """
                -------
                |●   ●|
                |  ●  |
                |●   ●|
                -------
                """;
                String dice6= """
                -------
                |●   ●|
                |●   ●|
                |●   ●|
                -------
                """;
                switch(roll){
                    case 1-> System.out.println(dice1);
                    case 2-> System.out.println(dice2);
                    case 3-> System.out.println(dice3);
                    case 4-> System.out.println(dice4);
                    case 5-> System.out.println(dice5);
                    case 6-> System.out.println(dice6);
                }
    }
}
