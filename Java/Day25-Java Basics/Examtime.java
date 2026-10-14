import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
// import java.util.Timer;
// import java.util.TimerTask;
public class Examtime {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter exam day.month and year respectively ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println("Enter exam hour and minuute respectively ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int second = 0;
        LocalDateTime dt2 = LocalDateTime.of(year,month,day,hours,minutes,second);
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
        @Override
        public void run(){

        LocalDateTime dt1 = LocalDateTime.now();
        Duration time = Duration.between(dt1,dt2);

        if(time.isZero() || time.isNegative()){
            System.out.println("Exam time!!");
            timer.cancel();
            return;
        }
        long days = time.toDaysPart();
        int hrs = time.toHoursPart();
        int mins = time.toMinutesPart();
        int secs = time.toSecondsPart();
        System.out.printf("%d days %02d hours %902d minutes %02d seconds%n",days,hrs,mins,secs);
}
    };
            timer.scheduleAtFixedRate(task,0,1000);
            scanner.close();
}
}
        //     int count = (minutes*60)+second;
        //     @Override
        //     public void run(){
        //         int min=count/60;
        //         int sec = count%60;
        //         System.out.printf("%02d:%02d%n",min,sec);
        //         count --;
        //         if(count<=0){
        //             System.out.println("Time's Up");
        //             timer.cancel();
        //         }
        //     }
        // }; 
        // timer.scheduleAtFixedRate(task,0,1000);