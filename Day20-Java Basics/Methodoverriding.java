public class Methodoverriding {
    public static void main(String [] args){
        //Method overriding = When a subclass provides its own
        //implementation of a method that is already defined.
        //Allows for code reusability and give specific implementation

        DogTwo dog = new DogTwo();
        CatTwo cat = new CatTwo();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
        
    }
}
