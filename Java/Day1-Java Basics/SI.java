public class SI{
    public static void main(String[]args){
        double principal = 1000.0;
        double rate = 10.2;
        double time = 5.0;
        double si = (principal * rate  * time)/100;
        System.out.println("The simple interest is:"+si);
    }
}