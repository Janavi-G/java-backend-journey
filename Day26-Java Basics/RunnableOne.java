public class RunnableOne implements Runnable {
    @Override
    public void run(){
        for(int i = 1;i<=5;i++){
            try{
            System.out.println(i);
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("THread was interuppted");;
        }
    }
    }
}
