import java.util.Scanner;
public class NumberThread {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        RunnableOne myrun = new RunnableOne();
        Thread thread = new Thread(myrun);
        thread.start();
    scanner.close();
}
}