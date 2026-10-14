import java.util.ArrayList;
public class marksanalyzer {
    public static void main(String []args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(92);
        marks.add(65);
        marks.add(88);
        marks.add(45);
        marks.add(91);
        marks.add(73);

        int max= marks.get(0);
        int min = marks.get(0);
        int avg= 0;int pass = 0;int fail = 0;
        for(int mar:marks){
            if(mar > max){
                max = mar;
            }
             if (mar < min){
                min = mar;
            }
            avg += mar;
        }
        System.out.println("Max is"+max);
        System.out.println("Min is "+min);
        System.out.println("Avg is"+avg/marks.size());
        for(int mar:marks){
            if(mar>= 75){
                pass++;
            }
            else if(mar<40){
                fail++;
            }
}

    System.out.println("Top scoring no of students is"+pass);
    System.out.println("Failed no of students is "+fail);
    }

}