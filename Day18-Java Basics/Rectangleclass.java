public class Rectangleclass {
    double length;
    double width;

    Rectangleclass(double length,double width){
        this.length = length;
        this.width=width;
    }
         double calculateArea(){
        return length*width;
    }
    double calculatePerimeter(){
        return  2*(length+width);
    }
}