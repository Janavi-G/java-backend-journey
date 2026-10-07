import java.util.HashMap;
import java.util.Scanner;
public class WFC {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to count word frequency");;
        String line = scanner.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        String [] words = line.split("\\s+");
        for( String w:words){
            if(!map.containsKey(w)){
            map.put(w,1);
            }
            else{
                int count = map.get(w);
                map.put(w,count+1);
        }
    }
    System.out.println(map);
    scanner.close();
}
}