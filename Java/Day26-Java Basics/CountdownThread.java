public class CountdownThread {
    public static void main(String []args){
    RunnableTwo myrun = new RunnableTwo();
    Thread thread = new Thread(myrun);
    thread.start();
    }
}