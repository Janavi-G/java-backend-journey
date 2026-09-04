public class C extends S{
    double radius;

    C(double radius){
        this.radius=radius;
    }
    
    @Override
    void area(){
        System.out.println("area of circle is "+3.14*radius*radius);
    }
}