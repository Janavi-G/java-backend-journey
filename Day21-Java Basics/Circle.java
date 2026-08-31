public class Circle  extends Shape{
    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void area(){
        double area = 3.14*radius*radius;
        System.out.println("The area of circle is:"+area);
    }
}