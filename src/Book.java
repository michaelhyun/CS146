
public class Book{
     private String title;
     private String author;
     private int ISBN;
     private boolean available;

     public Book(String title, String author, int ISBN, boolean available){
            this.ISBN = ISBN;
            this.available = available;
            this.title = title;
            this.author = author;
     }
        
     public void editBook(){
    	 
     }
     
     public boolean isAvailable(Book x){
         return x.available;
     }   

        
    }