
public class Book{
     private String title;
     private String author;
     private int serial;
     private boolean available;

     public Book(String title, String author, int serial, boolean available){
            this.serial = serial;
            this.available = available;
            this.title = title;
            this.author = author;
     }
     public boolean isAvailable(Book x){
         return x.available;
     }   

        
    }