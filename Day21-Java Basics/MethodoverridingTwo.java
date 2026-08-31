public class MethodoverridingTwo {
    public static void main(String[]args){
        DogThree dog = new DogThree();
        CatThree cat = new CatThree();
    
        dog.makeSound();
        cat.makeSound();
    }
}