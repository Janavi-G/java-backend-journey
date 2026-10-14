import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Marksfile {
    public static void main(String []args){
        String filePath = "C:\\Users\\Janu\\OneDrive\\Desktop\\Backend Journey\\Day24-Java Basics\\marks.txt";
        ArrayList<Integer> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
        String line;
        while((line =reader.readLine()) !=null){
            int n = Integer.parseInt(line);
                list.add(n);
        }
        }
        catch(FileNotFoundException e){
                System.out.println("FILE NOT FOUND");
        }
        catch(IOException e){
            System.out.println("There is an input output error");
        }
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;int score = 0;int pass = 0;
        for(int num:list){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            sum+=num;
        }

        for(int num:list){
            if(num>=75){
                score++;
            }
            if(num>=40){
                pass++;
            }
        }
        System.out.println("Highest:"+max);
        System.out.println("Lowest:"+min);
        System.out.println("Average:"+(double)sum/list.size());
        System.out.println("Scored high:"+score);
        System.out.println("Passed:"+pass);
}
}