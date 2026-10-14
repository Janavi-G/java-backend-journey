import java.util.Random;
public class random {
    public static void main(String []args){
        Random random = new Random();
        double num1;
        int num2;
        int num3;
        boolean isHeads;
        num1 = random.nextDouble(1,101);
        num2 = random.nextInt(1,101);
        num3 = random.nextInt(1,101);
        System.out.println("The random number is :"+num1);
        System.out.println("The random number is :"+num2);       
        System.out.println("The random number is :"+num3); 
        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("Heads it is!");
        }
        else{
        System.out.println("It is Tales");      
        }
    }
}