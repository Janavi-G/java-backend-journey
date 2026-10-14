import java.util.Scanner;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Musicplayer {
    public static void main(String []args){
        //How to play audio with Jaava(.wav,.au,.aiff)
        String filePath = "Day24-Java Basics\\file_example_WAV_1MG.wav";
        File file = new File(filePath);
        System.out.println(file.getAbsolutePath());
        try(Scanner scanner = new Scanner(System.in);
        AudioInputStream audioStream  = AudioSystem.getAudioInputStream(file)){
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            String response = " ";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("Enter your choice");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P"  ->clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case"Q" -> clip.close();
                    default ->System.out.println("Invalid choice");
                }
            }
    }
    catch(FileNotFoundException e){
        System.out.println("Could not locate file");
    }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Bye!");
        }
        // scanner.close();
    }
}