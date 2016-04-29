import java.util.Scanner;


/**
 * Created by Michael, David, Anjani, Vignesh on 4/4/2016.
 * Library System that holds a book database and user account database
 */
import java.util.Hashtable;

/**
 * @author Michael, David, Anjani, Vignesh
 *
 */
public class Library {
private String libraryName;

private Hashtable bookList;
private Hashtable userAccounts;


    public Library(String name, Hashtable books, Hashtable users){
        this.libraryName = name;
       this.bookList = books; 
       this.userAccounts = users;
    }

    public static void main(String[] args){
        System.out.println("Welcome to the Library");
        System.out.println("What do you want to do today: ");
        Scanner in = new Scanner(System.in);

    }
    
    /**
     * Returns book to the library
     * @param name name of book
     */
    public static void returnBook(Book name){

        System.out.println("Thank you for returning: " );
    }
    
    
    /**
     * Adds book to the list of books in library
     * @param book the book to add
     */
    public static void donateBook(Book book){
    	
    	System.out.println("Thank you for donating: " );
    	
    }
    
    /**
     * Check out a book
     * @param book the book to check out
      */
    public static void checkOutBook(Book book){
    	System.out.println("Checked out on: " );
    	System.out.println("Due date: " );
    	
    }
    



}
