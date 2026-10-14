import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class readfiles{
    public static void main(String []args){
        //How to read a file using Java (3popular options)
        //BufferedReader +FileReader: Best for reading text files line-by-line
        //FileInputStream:Best for binary files(e.g images,audio files)
        //RandomAccessFile: Best for read/write specific portions of a large file
        String filePath = "C:\\Users\\Janu\\OneDrive\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            // reader.readLine();
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            System.out.println("That file exists");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}