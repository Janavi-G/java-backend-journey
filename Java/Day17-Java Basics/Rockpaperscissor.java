import java.util.Scanner;
import java.util.Random;
public class Rockpaperscissor {
    public static void main(String[]args){
        //ROCK PAPER SCISSOR GAME
        //declare variables
        //get choice from user
        //get random choice for computer
        //ask to play again
        //goodbye message
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        do{
        System.out.print("Enter your move: ");
        playerChoice = scanner.nextLine().toLowerCase();
        
        if(!playerChoice.equals("rock")&&
        !playerChoice.equals("paper")&&
        !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
            continue;
        }
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);
        
        if(playerChoice.equals(computerChoice)){
           System.out.println("Its a tie"); 
        }
        else if(playerChoice.equals("rock")&& computerChoice.equals("scissors")||
                playerChoice.equals("paper")&& computerChoice.equals("rock")||
                playerChoice.equals("scissors")&& computerChoice.equals("paper")){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
        System.out.println("Play again(yes/no)");
        playAgain = scanner.nextLine();
    }while(playAgain.equals("yes"));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}