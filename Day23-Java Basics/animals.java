public class animals {
    public static void main(String[]args){
        Anime ani = new Dg();
        ani.eat();
        if(ani instanceof Dg){
        Dg dog = (Dg)ani;
        dog.bark();
    }
}
}