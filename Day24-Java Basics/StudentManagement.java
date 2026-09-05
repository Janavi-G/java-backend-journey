import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagement {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        // try{
        ArrayList<Object> student = new ArrayList<Object>();
        boolean isRunning = true;
        while(isRunning){
        System.out.println("**********Student Management System************");
        System.out.println("1.Add Student");
        System.out.println("2.Display Students");
        System.out.println("3.Search Student");
        System.out.println("4.Delete Student");
        System.out.println("5.Find Topper");
        System.out.println("6.Calculate Average");
        System.out.println("7.Exit");
        System.out.println("Enter your choice");
        char ch = scanner.next().charAt(0);

        switch(ch){
                        case '1' ->{
                            System.out.println("Enter name:");
                            String name = scanner.next();
                            student.add(name);
                            System.out.print("Enter ID:");
                            int id = scanner.nextInt();
                            student.add(id);
                            System.out.print("Enter marks");
                            double marks = scanner.nextDouble();
                            student.add(marks);
                        }
                        case '2'-> {
                            System.out.println("Displaying students..");
                            int i = 0;
                            while(i<(student.size()/3)){
                                int n = i*3;
                                System.out.println("Name:"+student.get(n));
                                System.out.println("ID:"+student.get(n+1));
                                System.out.println("Marks:"+student.get(n+2));
                                i++;
                            }
                        }
                        case '3'->{
                                        System.out.println("Enter an ID to search");
                                        int num = scanner.nextInt();
                                        boolean isFound = false;
                                        for(Object stu :student){
                                            if(stu instanceof Integer && (int)stu == num){
                                                System.out.println("Student found!");
                                                int p = student.indexOf(num);
                                                System.out.println("Name:"+(student.get(p-1)));
                                                System.out.println("Marks:"+(student.get(p+1)));
                                                isFound = true;
                                                }
                                                else{
                                                    continue;
                                                }
                                            }
                                            if(!isFound){
                                                System.out.println("Student not found!");
                                            }
                                        }
                            case '4' ->{
                                        System.out.println("Enter an ID to delete");
                                        int num = scanner.nextInt();
                                                int ind = student.indexOf(num);
                                                if(ind != -1){
                                                student.remove(ind+1);
                                                student.remove(ind);
                                                student.remove(ind-1);
                                                System.out.println("Student deleted successfully!");
                                                }
                                                else{
                                                    System.out.println("Student not found!");
                                                }
                                        }
                                case'5' ->
                                            {
                                            if(student.size() == 0){
                                                System.out.println("No students available!");
                                            }
                                            else{
                                                double max = (double) student.get(2);

                                                for(Object stu : student){
                                                    if(stu instanceof Double){
                                                        double marks = (double) stu;

                                                        if(marks > max){
                                                            max = marks;
                                                        }
                                                    }
                                                }
                                                int p = student.indexOf(max);
                                                System.out.println("Topper:");
                                                System.out.println("Name:" + student.get(p - 2));
                                                System.out.println("ID:" + student.get(p - 1));
                                                System.out.println("Marks:" + student.get(p));
                                            }
                                        }
                                        case '6' ->
                                         {
                                            if(student.size() == 0){
                                                System.out.println("No students available!");
                                            }
                                            else{
                                                double sum=0.0;
                                                for(Object stu : student){
                                                    if(stu instanceof Double){
                                                        double marks = (double) stu;
                                                            sum += marks;
                                                        }
                                                }
                                                System.out.println("Average marks is "+sum/(student.size()/3));
                                            }
                                        }
                                        case '7' ->{
                                            System.out.println("Thank you!");
                                            isRunning = false;
                                        }
                                    }
                                }
                                    // }
                                        //     catch(Exception e){
                                        //     System.out.println("Unkown exception!");
                                        // }
                                        scanner.close();
        }
    }