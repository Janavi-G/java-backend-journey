import java.util.Scanner;

public class Dynamicpolymorphism {
    public static void main(String []args){
        //runtime or dynamic polymorphism= when the method that gets executed 
        // is decided at runtime based on the actual type of the object
        Scanner scanner = new Scanner(System.in);
        newAnimal animal;
        System.out.println("Would you like a dog or a cat(1.Dog 2.Cat)");
        int choice = scanner.nextInt();

        if(choice ==1){
            animal = new newDog();
            animal.speak();
        }
        else if(choice ==2){
            animal = new newCat();
            animal.speak();
        }
        scanner.close();
    }
}