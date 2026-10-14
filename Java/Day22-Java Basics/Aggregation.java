public class Aggregation {
    public static void main(String [] args){
        //Aggregation = represents a "has-a" relationship between objects.
        //one object contains another object as part of its structure.
        //but the contained object/s can exist independently.

        aBook book1 = new aBook("The fellow of the ring",423);
        aBook book2 = new aBook("The two towers",352);
        aBook book3 = new aBook("The return of the king",416);
        aBook[] books = {book1,book2,book3}; 

        for (aBook b :books){
        System.out.println(b.displayinfo());
        }

        Library lib = new Library("NYC public library",1897,books);

        lib.displayinfo();
    }
}
