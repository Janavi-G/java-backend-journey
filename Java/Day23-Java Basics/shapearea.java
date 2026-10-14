public class shapearea {
    public static void main(String []args){
       Shp[] shapes = {new cir(5),new rec(10, 20)};

    for(Shp s : shapes) {
        s.area();
    }
    }
}