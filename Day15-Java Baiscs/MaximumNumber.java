// import java.util.Scanner;
// import java.util.Random;
public class MaximumNumber{
    public static void main(String[]args){
        int[] array = {70,20,30,40,50};
        int max = array[0];
        for(int i = 0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}