import java.util.Scanner;
public class threading{
    public static void main(String []args){
        //Threading = Allows a program to run multiple task simultaneously
        //Helps improve performance with time consuming operations
        //(File I/O network communication,or any background tasks)
        //How to create a Thread
        //Option 1. Extend the thread class(simpler)
        //Option2.Implement the runnable interface (better)
        Scanner scanner = new Scanner(System.in);
        MyRunnable myRun = new MyRunnable();
        Thread thread  = new Thread(myRun);
        thread.setDaemon(true);
        thread.start();

        System.out.println(" YOU HAVE  5 SECONDS TO ENTER YOUR NAME");
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello"+name);
        scanner.close();
    }
}