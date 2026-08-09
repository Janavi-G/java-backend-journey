import java.util.Random;
public class random1{
    public static void main(String [] args){
        Random random = new Random();
        double num = random.nextDouble(1,101);
        System.out.println(num);
    }
}