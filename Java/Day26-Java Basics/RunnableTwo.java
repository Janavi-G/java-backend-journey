public class RunnableTwo implements Runnable{
    @Override
    public void run(){
        for(int i = 5;i>=1;i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("Time's Up!");
    }
}