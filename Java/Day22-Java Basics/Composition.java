public class Composition {
    public static void main(String []args){
        //Compostiion = represents a part - of relationship between objects.
        //for eg = an engine is part of a car;4
        // Allows complex objects to be constructed from smaller objects

         aCar  car = new aCar("Corvette",2025,"VB");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);
        
        car.start();
        }
}