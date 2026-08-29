public class BookT {
        String title;
        String author;
        double price;
        boolean available =true;
    
        BookT(String title,String author,double price){
            this.title = title;
            this.author = author;
            this.price = price;
            // this.available = true;
        }

        void showDetails(){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
            System.out.println("Available: "+available);
        }

        void borrowBook(){
            // System.out.println();

            if(available){
                System.out.println("The book is available,and it is "+title);
                available = false;
            }
            else{
                System.out.println("Borrow of the book"+title+"is not possible since it is not available");
            }
        }
        
        void returnBook(){
            if(!available){
                System.out.println("The book you returned is" +title+",thank you");
                available = true;
            }
        }
    }