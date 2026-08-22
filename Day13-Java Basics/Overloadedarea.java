public class Overloadedarea {
    public static void main(String []args){
       System.out.println(area(10));
       System.out.println(area(10.0,20.0));
       System.out.println(area(10.0,30.0));
    }
    static int area(int a){
        return a*a;
    }
    static int area(int a,int b){
        return a*b;
    }
    static double area(double a ,double b){
        return a*b;
    }
}