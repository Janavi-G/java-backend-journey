import java.util.Scanner;
    public class Foundseven{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            for(int i = 0;i<10;i++){
                int num = scanner.nextInt();
                if(num==7){
                    System.out.println("Found 7!");
                    break;
                }
            }
            scanner.close();
        }
}