public class marks {
    public static void main(String []args){
        Integer[] marks = {85,72,91,64,78};
        int[] marks2 = new int[marks.length];
        int total = 0;int pass = 0;
        for(int i = 0;i<marks.length;i++){
         marks2[i] = Integer.valueOf(marks[i]);
        }
        for(int i:marks2){
            total += i;
        }
        System.out.println(total);
        System.out.println(total/marks.length);
        int max = marks2[0];int min = marks2[0];
        for(int i = 0;i<marks2.length;i++){
            if(marks2[i]>max){
                max = marks2[i];
            }
            else if(marks2[i]<min){
                min = marks2[i];
            }
        }
        System.out.println("Max"+max);
        System.out.println("Min"+min);
    
        for(int i = 0;i<marks.length;i++){
            if(marks2[i]>=35){
                pass++;
            }
        }
        System.out.println("Passed no. of subjects"+pass);
    }
}