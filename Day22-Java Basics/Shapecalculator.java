public class Shapecalculator {
    public static void main(String []args){
        Shapez[] shapes = {
        new shapecircle(5), new shaperectangle(4,5),new shapetriangle(3,4)};
   
          for(Shapez shape:shapes){
            shape.area();
          }  
    }
}