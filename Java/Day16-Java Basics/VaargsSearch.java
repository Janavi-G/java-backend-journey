public class VaargsSearch {
    public static void main(String []args){
        System.out.println(contains(30,10,20,30,40));
        System.out.println(contains(50,10,20,30,40));
    }
    static boolean contains(int target,int...numbers){
        boolean found = false;
        for(int num:numbers){
            if(target == num){
                found = true;
            }
        }
        return found;
    }
}