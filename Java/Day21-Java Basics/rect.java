public class rect extends geometry{
    double length;
    double width;

    rect(double length,double width){
        this.length = length;
        this.width = width;
    }
  
    @Override
    double area(){
        return length*width;
    }
}