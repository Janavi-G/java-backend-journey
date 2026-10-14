import java.util.Scanner;
// import java.util.InputMismatchException;
public class exceptions {
    public static void main(String []args){
        //Exception = An event that interrupts the normal flow of a program
        //(Dividing by zero,file not found,mismatch input type)
        //Surround any dangerous code with a try{} blcok
        //try{},catch{},finally{}
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println(number);
    }
    // catch(InputMismatchException e){
    //     System.out.println("That wasn't a number!");
    // }
    // catch(ArithmeticException e){
    //     System.out.println("You cant divide by zero");
    // }
    catch(Exception e){
        System.out.println("Something went wrong");
    }
    finally{//used for cleaning up program
        scanner.close();
        System.out.println("This always executes");
    }
}
}