public class VarargsMax {
    public static void main(String []args){
        System.out.println(maximum(10,45,23,89,12));
    }
    static int maximum(int...numbers){
        int max = 0;
        for(int num:numbers){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
}
