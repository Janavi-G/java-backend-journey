public class Library {
        String name;
        int year;
        aBook[] books;
    
    Library(String name, int year, aBook[] books){
            this.name = name;
            this.year = year;
            this.books = books;
        }

        void displayinfo(){
            System.out.println("The"+this.year+" "+this.name);
            System.out.println("Books available in the library are: ");
            for (aBook b :books){
                System.out.println(b.displayinfo());
            }
        }
}