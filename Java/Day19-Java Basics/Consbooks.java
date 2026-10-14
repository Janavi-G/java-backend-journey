public class Consbooks {
    public static void main(String [] args){
        BookT book1 = new BookT("ABCD","Janavi",10.98);
        BookT book2 = new BookT("EFGH","Sowjanya",20.98);
        
        book1.showDetails();
        book1.borrowBook();
        book1.showDetails();
        book1.returnBook();
        book1.showDetails();

        book2.showDetails();
        book2.borrowBook();
        book2.showDetails();
    }
}