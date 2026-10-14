import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class EFA {
    public static void main(String []args){
        int n = 0;String[] data = new String [(3*n)];
        String filePath = "C:\\Users\\Janu\\OneDrive\\Desktop\\Backend Journey\\Day24-Java Basics\\employees.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) !=null){
                 n++;
                 data = line.split(",");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        for(int i = 0;i<n;i=i+3){
            String n0 = data[i];
            int n1 = Integer.parseInt(data[i+1]);
            double n2 = Double.parseDouble(data[i+2]);
           employeeefa emp = new employeeefa(n0,n1,n2);
            emp.display();
        }
    }
}
//Corrected version of this file is available in the same folder of  Employeefile.java
//Please refer it.