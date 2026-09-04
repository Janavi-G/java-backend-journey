public  class shapecircle extends Shapez{
    double radius;
    shapecircle(double radius){
        this.radius = radius;
    }
    @Override
    void area(){
        System.out.println(3.14*radius*radius);
    }
}