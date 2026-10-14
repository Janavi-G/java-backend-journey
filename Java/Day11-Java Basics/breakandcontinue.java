import java.util.Scanner;
    public class breakandcontinue{
        public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
             //break = break out of a loop(STOP)
             //continue = skip curent iteration of a loop and continue iteration(SKIP)
             for(int i = 0;i<10;i++){
                if(i==5){
                    continue;
                }
                System.out.println(i+" ");
             }
            scanner.close();
        }
    }