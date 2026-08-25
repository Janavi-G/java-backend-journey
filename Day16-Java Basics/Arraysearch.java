import java.util.Scanner;
public class Arraysearch {
    public static void main(String[] args){
    //    int[] numbers = {1,5,6,2,3,4,9,10};
    Scanner scanner= new Scanner(System.in);
       String [] fruits ={"apple","orange","banana"};
       boolean isFound = false;
       String target;
       System.out.print("Enter a fruit to search ");
       target = scanner.nextLine();
       
       for(int i= 0 ;i<fruits.length;i++){
        if(target.equalsIgnoreCase(fruits[i])){
            System.out.println("Element found at index: "+i);
            isFound = true;
            break;
        }
       } 
       if(!isFound){
        System.out.println("The element is not found in the array");
       }
       scanner.close();
    }
}