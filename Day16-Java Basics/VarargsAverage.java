public class VarargsAverage {
    public static void main(String[] args){
      System.out.println(average(10,20,30,40));  
    }
    static double average(double...numbers){
        int avg  = 0;double average = 0;
        for(double num:numbers){
            avg += num;
            average  = avg/numbers.length;
        }
        return average;
    }
}