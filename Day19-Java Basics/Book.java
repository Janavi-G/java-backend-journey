public class Book{
    String title;
    String author;
    Book(){
        this.title = "Nothing";
        this.author = "None";
    }
    Book(String title){
        this.title = title;
        this.author = "None";
    }
    Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    void showDetails(){
        System.out.println("The title is:"+title);
        System.out.println("The author is:"+author);
    }
}