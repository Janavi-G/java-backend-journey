import java.util.Scanner;
public class MarksAnalyzer {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;int i = 0;
        double average=0.0;int pass=0,fail=0;
        System.out.println("Enter the marks for 5 subjects");
        for( i = 0;i<5;i++){
            marks[i] = scanner.nextInt();
            total += marks[i];
            average = (double)total/5;
        }
        int min=marks[0],max=marks[0];
        for(i = 0;i<5;i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
            for(i = 0;i<5;i++){
            if(marks[i]<min){
                min= marks[i];
            }
        }
        for(i = 0;i<5;i++){
        if(marks[i]>35){
            pass++;
        }    
        else{
            fail++;
        }
        }
            System.out.println("The total is:"+total);
            System.out.println("Average:"+ average); 
            System.out.println("The highest mark: "+max);
            System.out.println("The lowest mark: "+min);
        System.out.println("Number of subjects passed:"+pass);
        System.out.println("Number of subjects failed:"+fail);
        scanner.close();
    }  
}  