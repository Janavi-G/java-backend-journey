public class IndependentChallengeTwo {
    public static void main(String []args){
        System.out.println(calculate(10,20));
        System.out.println(calculate(10.0,20.0));
        System.out.println(calculate(10,20,30));
    }
    static int calculate(int a ,int b){
        return a+b;
    }
    static double calculate(double a ,double b){
        return a*b;
    }
    static int calculate(int a ,int b,int c){
        return a+b+c;
    }
}