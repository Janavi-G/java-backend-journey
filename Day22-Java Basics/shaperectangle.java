public class shaperectangle extends Shapez {
    double length,width;
    shaperectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void area(){
        System.out.println(length*width);
    }
}