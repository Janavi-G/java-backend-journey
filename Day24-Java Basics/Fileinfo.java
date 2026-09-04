import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Fileinfo {
    public static void main(String []args){
        String filePath = "C:\\Users\\Janu\\OneDrive\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;int i = 0;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                i++;
            }
            System.out.println("No .of lines  read: " + i);
        }
        catch(FileNotFoundException e){
            System.out.println("File doesnt exists");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}