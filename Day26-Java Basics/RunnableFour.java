public class RunnableFour implements Runnable {
    @Override
    public void run(){
        for(int i = 65;i<=70;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");;
            }
    }
}
}