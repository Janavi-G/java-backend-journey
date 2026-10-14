import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;
public class Arraylist {
    public static void main(String [] args){
        //Array lsit = a resiable array that stores objects(autoboxing).
        //Arrays are fixed in size,but arraylists can change.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of food you like:");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0;i<=num;i++){
            System.out.println("Enter foods no."+i+":");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();
        // ArrayList<String> fruits = new ArrayList<>();
        // fruits.add("Apple");
        // fruits.add("Orange");
        // fruits.add("Banana");
        // fruits.add("Coconut");

        // // fruits.remove(0);
        // fruits.set(1,"Papaya");
        // System.out.println(fruits.get(0));
        // System.out.println(fruits.size());
        // Collections.sort(fruits);
        // System.out.println(fruits);
        // for(String fruit:fruits){
        //     System.out.println(fruit);
        }
    }