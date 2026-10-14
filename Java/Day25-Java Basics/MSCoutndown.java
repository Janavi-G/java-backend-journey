import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class MSCoutndown {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes and seconds respectively");
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = (minutes*60)+seconds;
            @Override
            public void run(){
                int min=count/60;
                int sec = count%60;
                System.out.printf("%02d:%02d%n",min,sec);
                count --;
                if(count<=0){
                    System.out.println("Time's Up");
                    timer.cancel();
                }
            }
        }; 
        timer.scheduleAtFixedRate(task,0,1000);
    scanner.close();
    }
}