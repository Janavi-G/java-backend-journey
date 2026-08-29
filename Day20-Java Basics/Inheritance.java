public class Inheritance {
    public static void main(String []args) {
        //Inheritance = one class inherits the attributes and methods 
        // from another class.
        //Grandparent->Parent-> Child
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // dog.photosynthesis(); not possible
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);
        plant.photosynthesis();
    }   
}
