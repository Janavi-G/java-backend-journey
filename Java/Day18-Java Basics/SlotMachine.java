import java.util.Scanner;
import java.util.Random;
public class SlotMachine {
   public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int balance = 100; 
    int bet; 
    int payout;
    String[] row;String playAgain;
    System.out.println("*********************");
    System.out.println("Welcome to Java Slots");
    System.out.println("Symbols: c , w, l, b, s");
    System.out.println("*********************");

    while(balance>0){
        System.out.println("Current balance: $"+balance);
        System.out.println("Place your bet amount");
        bet = scanner.nextInt();
        scanner.nextLine();
        if(bet>balance){
            System.out.println("Insufficient funds");
            continue;
        }
        else if(bet<=0){
        System.out.println("Bet must be greater than 0");
            continue;
        }
        else{
            balance -=bet;
        }
        System.out.println("Spinning...");
        row = spinRow();
        printRow(row);
        payout = getPayout(row,bet);
        if(payout > 0){
            System.out.println("You won $"+payout);
            balance += payout;
        }
        else{
            System.out.println("Sorry you lost this round");
        }
        System.out.println("Do you want to play again?(Y/N):");
        playAgain = scanner.nextLine();
        if(!playAgain.equals("Y")){
            break;
        }
        }    
        System.out.println("GAME OVER,Your final balance is $"+balance);
    scanner.close();
} 
static String[] spinRow(){
    String[] symbols = {"c" ,"w", "l", "b","s"};
    String [] row = new String[3];
    Random random = new Random();
    for(int i = 0;i<3;i++){
    
        row[i] = symbols[random.nextInt(symbols.length)];
}
    return row;
}
static void printRow(String[] row){
    System.out.println("**************");
    System.out.println(" "+String.join(" | ",row));
    System.out.println("**************");
}
static int getPayout(String[] row,int bet){
    if(row[0].equals(row[1]) && row[1].equals(row[2]) ){
        return switch(row[0]){
            case "c" -> bet*3;
            case "w" -> bet*4;
            case "l" -> bet *5;
            case "b"-> bet*10;
            case "s"-> bet*20;
            default -> 0;
        };
    }
    else if(row[0].equals(row[1]) ){
        return switch(row[0]){
            case "c" -> bet*2;
            case "w" -> bet*3;
            case "l" -> bet *4;
            case "b"-> bet*5;
            case "s"-> bet*10;
            default -> 0;
        };
    }
   else if(row[1].equals(row[2]) ){
        return switch(row[1]){
            case "c" -> bet*2;
            case "w" -> bet*3;
            case "l" -> bet *4;
            case "b"-> bet*5;
            case "s"-> bet*10;
            default -> 0;
        };
    }
    return 0;
}
}
 //JAVA SLOT MACHINE
    //declare varibales
    //display welcome message
    //play if balance is greater than 0
    //enter that amount
    // verify bet amount
    //verify if bet > amount
    // verify if bet>0
    //subtract bet from balance
    //spin row
    //print row
    //get payout
    //ask to play again
    //display exit message 