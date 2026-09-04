public class aBook {
    String title;
    int pages;

    aBook(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayinfo(){
        return this.title + "( "+this.pages+ " pages)";
    }
}
