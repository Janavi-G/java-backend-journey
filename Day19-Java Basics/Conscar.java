public class Conscar {
    String model;
    String color;

    Conscar(String model,String color){
        this.model = model;
        this.color = color;
    }
    void drive(){
        System.out.println("You drive "+this.color+"  "+this.model);
    }
}
