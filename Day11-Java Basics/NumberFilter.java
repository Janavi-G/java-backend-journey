public class NumberFilter {
    public static void main(String[]args){
        for(int i = 1;i<=30;i++){
            if(i%3==0){
                continue;
            }
            else if(i==20){
                break;
            }
            System.out.println(i);
        }
    }
}