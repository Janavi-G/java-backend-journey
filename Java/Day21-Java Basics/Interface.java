public class Interface {
    public static void main(String[]args){
        //interface = a blueprint for a class that specifies a set of abstract methods
        //that implementing classes must define.
        //supports multiple inheritance like behaviour.
        Rabbit rab = new Rabbit();
        Hawk haw = new Hawk();
        Fishy fis = new Fishy();
        rab.flee();
        haw.hunt();
        fis.flee();
        fis.hunt();
    }
}