import java.util.Scanner;
public class RestaurantMenu {
    public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("---------MENU---------");
    System.out.println("1.Pizza");
    System.out.println("2.Burger");
    System.out.println("3.Pasta");
    System.out.println("4.Exit");
    System.out.print("Enter your choice:");
    int choice = scanner.nextInt();
    
    switch(choice){
        case 1 ->System.out.println("You selected Pizza");
        case 2 ->System.out.println("You selected Burger");
        case 3 ->System.out.println("You selected Pasta");
        case 4 ->System.out.println("Thank you!GoodBye");
        default ->System.out.println("Invalid Choice");
    }
    scanner.close();
    }
    
}
