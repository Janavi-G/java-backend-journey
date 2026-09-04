import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class writefiles {
    public static void main(String []args){
        //How to write  a file using Java(popular options
        //FileWriter = good for small or medium - sized text files
        //BufferedWriter = Better performance for large amount of text
        //PrintWriter = Best for structured data,like report or logs
        //FileOutputStream = Best for binary files(e.g., images,audio files)
        String filePath ="C:\\Users\\Janu\\OneDrive\\Desktop\\test.txt";
        String textContent = """
                                            I like pizza ! \n Its really good
                                            Roses are red,
                                            Violets are blue
                                            Booty booty booty
                                            Rocking everywhere""";
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }   
    }
}