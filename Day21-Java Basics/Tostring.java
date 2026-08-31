public class Tostring {
    public static void main(String []args){
        //.toString = Method inherited from the object class
        //used to return string representation of an object
        //By default,it returns a hash code as a uniue identifier.

        car car1 = new car("Ford","Mustang",2025,"Red");
        car car2 = new car("Chevrolet","Corvette",2026,"Blue");
        System.out.println(car1);
        System.out.println(car2);
    }
}