// import java.util.Scanner;
// public class EligibilityChecker{
//     public static void main(String [] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your name and age respectively");
//         String name = scanner.nextLine();
//         String age = scanner.nextLine();
//         if(name.isEmpty() || age.isEmpty()){
//             System.out.println("Enter both your name and age properly");
//         }
//         else {
//             int ageInput = Integer.parseInt(age);

//         if(name.isEmpty() && ageInput >0){
//             System.out.println("Enter your name:");
//         }
//         else if(!name.isEmpty() && ageInput <=0){
//             System.out.println("Please enter your age properly");
//         }
//         else{
//             System.out.println("You have provided your details correctly");
//         }
//         scanner.close();
//     }
// }
// }
////////////////Chatgpt answer///////////////////////////////
import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid age.");
            scanner.close();
            return;
        }

        int age = scanner.nextInt();

        if (name.isEmpty() || age <= 0) {
            System.out.println("Please enter your name and age properly.");
        } else {
            System.out.println("You have provided your details correctly.");
        }
        scanner.close();
    }
}