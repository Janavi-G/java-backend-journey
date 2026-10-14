public class cir extends Shp {
    double radius;

    cir(double radius){
        this.radius = radius;
    }

    void area(){
        System.out.println(3.14*radius*radius);
    }
}
