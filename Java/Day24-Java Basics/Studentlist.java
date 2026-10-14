import java.util.ArrayList;
public class Studentlist {
    public static void main(String []args){
        ArrayList<String> students = new ArrayList<>();
        students.add("Janavi");
        students.add("Sowjanya");
        students.add("Shantha");
        students.add("Somasekhar");
        students.add("Sulochana");

        System.out.println(students);
        students.remove(1);
        students.set(0,"Pinky");
        students.contains("Janavi");
        System.out.println(students.size());
    }
}
