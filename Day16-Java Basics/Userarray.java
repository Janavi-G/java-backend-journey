import java.util.Scanner;
public class Userarray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        System.out.println("What number of foods do you want?");
        int n = scanner.nextInt();
        foods = new String[n];
        scanner.nextLine();
        for(int i = 0;i<foods.length;i++){
            System.out.print("Enter the foods");
            foods[i] = scanner.nextLine();
        }
        scanner.close();
        for(String food :foods){
            System.out.println(food);
        }
        scanner.close();
    }    
}
