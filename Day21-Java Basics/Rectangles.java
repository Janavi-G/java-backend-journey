public class Rectangles extends Shape{
    double length;
    double width;

    Rectangles(double length,double width){
        this.length = length;
        this.width = width;
    }

        void area(){
        double area = length*width;
        System.out.println("The area of the rectangle is:"+area);

    }
}
