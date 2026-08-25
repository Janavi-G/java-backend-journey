public class PositiveNumberCounter {
    public static void main(String[]args){
        System.out.println("Positve Numbers are:"+ countPositive(-5,10,-2,20,30,-8));
    }
    static int countPositive(int...numbers){
        int count = 0;
        for(int num:numbers){
            if(num > 0){
                count++;
            }
        }
        return count;
    }
}