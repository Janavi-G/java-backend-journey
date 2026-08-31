public class circles  extends geometry{
   double radius;

   circles(double radius){
    this.radius = radius;
   }
   
    @Override
    double area(){
        return Math.PI *radius*radius;
    }
}