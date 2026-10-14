public class Multithreading {
    public static void main(String []args){
        //Multithreading = Enables a program to run multiple threads concurrently
        //(Thread = A set of instructions that run independently)
        //Useful for background tsks or time consuing operations

        // MyRun myrun = new MyRun();
        Thread thread1= new Thread(new MyRun("ping"));
        Thread thread2= new Thread(new MyRun("pong"));
        System.out.println("Game Start!");

       thread1.start();
        thread2.start();
        try{
             thread1.join();
        thread2.join();
        }
       catch(InterruptedException e){
        System.out.println("Main thread was interrupted");
       }
        System.out.println("Game Over");
    }
}