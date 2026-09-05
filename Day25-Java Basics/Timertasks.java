import java.util.Timer;
import java.util.TimerTask;

public class Timertasks {
    public static void main(String []args){
        //Timer = Class that schedules tasks at specific times or periodically
        //Useful for: sending notifcations,scheduled updates,reptitive actions
        //TimerTask = Rperesents the task that will be executed by the timer
        //You willl extend the TimerTask class to define your task
        //Create a subclass of TimerTask and @Override run()
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;
            @Override
            public void run(){
                System.out.println("Hello");
                count --;
                if(count<=0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };
        
        timer.schedule(task,3000,1000);
    }
}
