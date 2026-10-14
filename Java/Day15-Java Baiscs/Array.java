import java.util.Arrays;
// import java.util.Scanner;
public class Array {
    public static void main(String[]args){
        // Scanner scanner = new Scanner(System.in);
      //array = collection of values of the same data type
      //think of it as a variable that can store more than 1 value
      String[] fruits = {"apple","orange","banana","coconut"};
      // fruits[0] = "pineapple";
      // int numofFruits = fruits.length;
      // for(int i = 0;i<fruits.length;i++){
      // System.out.print(fruits[i]+" ");
      // }
      Arrays.sort(fruits);
      Arrays.fill(fruits,"pineapple");
      for(String fruit:fruits){
        System.out.println(fruit);
      }
      // scanner.close(); 
    } 
}
