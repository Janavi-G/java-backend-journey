public class Overloadcalculate {
    public static void main(String[]args){
        calculate(10,20);
        calculate(10.0,20.0);
        calculate(10,20,30);
    }
    static void calculate(int a,int b){
        System.out.println(a+b);
    }
    static void calculate(double a,double b){
        System.out.println(a*b);
    }
    static void calculate(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
