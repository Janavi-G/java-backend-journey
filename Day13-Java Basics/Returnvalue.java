public class Returnvalue {
    public static void main(String []args){
        double length = 10.0;
        double width = 10.0;
        System.out.println("The area of rectangle is "+calculateArea(length,width));
    }
    static double calculateArea(double l,double w){
        return l*w;
    }
}