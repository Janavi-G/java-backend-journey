import java.util.Random;
public class random2 {
    public static void main(String [] args){
        Random random = new Random();
        int dice = random.nextInt(1,7);
        System.out.println(dice);
    }
}