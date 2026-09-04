import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class NFA {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;int even = 0;int odd = 0;
        String filePath = "C:\\Users\\Janu\\OneDrive\\Desktop\\Backend Journey\\Day24-Java Basics\\numbers.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
        String line;
        while((line =reader.readLine()) != null){
            int num = Integer.parseInt(line);
                list.add(num);
        }
        System.out.println(list);
    }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        int max = list.get(0);
        int min = list.get(0);
        for(int num:list){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            sum +=num;
            // avg = sum/list.size();
            }
            for(int num:list){
                if(num % 2==0){
                    even ++;
                }
                if(num % 2  != 0){
                    odd++;
                }
            }
            System.out.println("Max:"+max);
            System.out.println("Min:"+min);
            System.out.println("Sum:"+sum);
            System.out.println("Avg:"+ (double)sum/list.size());
            System.out.println("Even:"+even);
            System.out.println("Odd:"+odd);
}
}