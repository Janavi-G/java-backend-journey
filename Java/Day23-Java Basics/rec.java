public class rec extends Shp {
    double length;
    double width;
    rec(double length,double width){
        this.length = length;
        this.width = width;
    }

    void area(){
        System.out.println(length*width);
    }
}