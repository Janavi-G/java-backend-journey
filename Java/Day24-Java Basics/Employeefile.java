import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Arrays;
public class Employeefile {
    public static void main(String []args){
        // String[] data = new String [(0)];
        String filePath = "C:\\Users\\Janu\\OneDrive\\Desktop\\Backend Journey\\Day24-Java Basics\\employees.txt";
        String line;double max = 0;
                            double min = Double.MAX_VALUE;
                            double totalSalary = 0;
                            int employeeCount = 0;
                            int abovefifty = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while((line = reader.readLine())!=null){
                String[] data = line.split(",");
                String name = data[0];
                int id = Integer.parseInt(data[1]);
                double salary = Double.parseDouble(data[2]);
                if(salary>max){
                    max = salary;
                }
                if(salary<min){
                    min = salary;
                }
                totalSalary += salary;
                employeeCount++;
                employeeefa emp = new employeeefa(name,id,salary);
                emp.display();
                if(salary>50000){
                    abovefifty ++;
                }
            }
    }
     catch(FileNotFoundException e){
        System.out.println("File not found!!");
     }
     catch(IOException e){
        System.out.println("Something went wrong");
     }

     System.out.println("Max salary: "+max);
     System.out.println("Min salary: "+min);
     System.out.println("Average salary: "+(totalSalary/employeeCount));
     System.out.println("Above 50000: "+abovefifty);
}
}
//         try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
//             String line;
//             while((line = reader.readLine()) !=null){
//                 ArrayList<Integer> integers = new ArrayList<>();
//                     ArrayList<Double> doubles = new ArrayList<>();
//                     ArrayList<String> strings = new ArrayList<>();
//                 String [] data = line.split(",");
//                 //  System.out.println(Arrays.toString(data));
//                  for(String value:data){
//                                 try {
//                             int intValue = Integer.parseInt(value);
//                             integers.add(intValue);
//                             continue; // Move to next item if successful
//                         } catch (NumberFormatException e1) {
//                             // Not an integer, try double next
//                         }

//                         // Check if it is a Double
//                         try {
//                             double doubleValue = Double.parseDouble(value);
//                             doubles.add(doubleValue);
//                             continue; // Move to next item if successful
//                         } catch (NumberFormatException e2) {
//                             // Not a double, treat as a pure String
//                         }
//                         // If both fail, it is a pure String
//                         strings.add(value);
//                     //    employeeefa emp = new employeeefa(strings[0],integers[0],doubles[0]);
//                     //     emp.display();
//         }
//     }
// }
//         catch(FileNotFoundException e){
//             System.out.println("File not found");
//         }
//         catch(IOException e){
//             System.out.println("Something went wrong");
//         }
// }
//     }