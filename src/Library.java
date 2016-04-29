import java.util.Scanner;

/**
 * Created by Michael Hyun on 4/4/2016.
 */
import java.util.Hashtable;
public class Library {
private String libraryName;

private Hashtable bookList;
private Hashtable userAccounts;


    public Library(String name){
        this.libraryName = name;
        Hashtable bookList = new Hashtable();
        bookList = this.bookList;
        Hashtable userAccounts = new Hashtable();
        userAccounts = this.userAccounts;
    }

    public static void main(String[] args){
        System.out.println("Welcome to the Library");
        System.out.println("What do you want to do today: ");
        Scanner in = new Scanner(System.in);




    }
    
    public static void returnBook(Book name){

        System.out.println("Thank you for returning: " + name.title);
    }

    private class Book{
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

    private class UserAccount{
        private String first;
        private String last;
        private String email;
        private String password;

     public UserAccount(String first, String last, String email, String password) {
         this.first = first;
         this.last = last;
         this.email = email;
         this.password = password;
     }
     public void editAccount(){

     }

     public void deleteAccount(){

     }
    }
}
