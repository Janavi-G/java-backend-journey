public class Consbook{
    public static void main(String[]args){
        Book book1 = new Book();
        Book book2 = new Book("Java");
        Book book3 = new Book("Java","James Gosling");

        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
    }
}