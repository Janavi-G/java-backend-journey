public class TwoThreads {
    public static void main(String []args){
        RunnableThree myrun1 = new RunnableThree();
        RunnableFour myrun2 = new RunnableFour();
        Thread thread1 = new Thread(myrun1);
        Thread thread2 = new Thread(myrun2);
        thread1.start();
        thread2.start();
    }
}