public class R extends S{
    double length;
    double width;

    R(double length,double width){
        this.length = length;
        this.width = width;;
    }
    
    @Override
    void area(){
        System.out.println("area of rectangle is "+(length*width));
    }
}