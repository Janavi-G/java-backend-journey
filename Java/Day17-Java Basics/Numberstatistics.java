import java.util.Scanner;
public class Numberstatistics {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Max is "+findMax(10,25,32,47,50,61,72));
        System.out.println("Min is"+findMin(10,25,32,47,50,61,72));      
        System.out.println("No. of even is "+countEven(10,25,32,47,50,61,72));
        System.out.println("No. of odd is "+countOdd(10,25,32,47,50,61,72));
        scanner.close();
    }
    static int findMax(int...numbers){
        int max = numbers[0];
        for(int num:numbers){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
    static int findMin(int...numbers){
        int min = numbers[0];
        for(int num:numbers){
            if(num<min){
                min = num;
            }
        }
        return min;
    }
    static int countEven(int...numbers){
        int count = 0;
        for(int num:numbers){
            if(num%2==0){
                count ++;
            }
        }
        return count;
    }
    static int countOdd(int...numbers){
        int count = 0;
        for(int num:numbers){
            if(num%2!=0){
                count ++;
            }
        }
        return count;
    }
}
