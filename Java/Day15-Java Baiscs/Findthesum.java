public class Findthesum {
    public static void main(String[]args){
      int[] num = {5,10,15,20,25}; int sum = 0;
      for(int i =0;i<num.length;i++){
        sum +=num[i];
      } 
      System.out.println(sum);
    }
}