public class LibraryTester{
	 
	  public static void main(String[] args){
	  		Library library = new Library();

	  		Scanner in = new Scanner(System.in);
	  		
	  		String inputU;
	  		String inputP;

	  		int decisionCounter = 0;

	  		System.out.println("Please enter in your ID or Email: ");
	  		inputU = in.nextline(); //Enter in User
	  		inputP = in.nextline(); //Enter in Pass

	  		//Library.checkLogin(); 


	  		if(library.checkLogin()){
	  			if(decisionCounter == 2){
	  					library.cycle(); //Add donated books to library database, any book checked out at 0 count are returned and next person in queue gets the book. Maybe send notification?
	  			}
        	
        	System.out.println("Welcome to the Library");
        	System.out.println("What do you want to do today: ");
        	System.out.println("1. Find a book"); //Goes further into searching book by name, category, isbn, etc;
        	System.out.println("2. Donate a book"); //Add to donation book stack
        	System.out.println("3. Check status") ;//Check when books are due
        	System.out.println("4. Renew a book");
        	int option = in.nextInt();

        	if(option == 1){
        		System.out.println("How do you want to search for this book?");
        		System.out.println(" 1. Title	2. Author	3.Genre	   4. ISBN");
        				option = in.nextInt();
        				if(option == 1){
        					System.out.println("Enter in a title: ");
        					String title = in.nextLine();
        					library.searchTitle(title);
        				}

        				if(option ==2){
        					System.out.println("Enter in an author: ");
        					String author = in.nextLine();
        					library.searchAuthor(author);
        				}

        				if(option == 3){
        					System.out.println("Enter in a genre");
        					String genre = in .nextLine();
        					library.searchGenre(genre);
        				}

        				if(option == 4)}{
        					System.out.println("Enter in the ISBN: "){
        						int isbn = in.nextInt();
        						library.searchISBN(isbn);
        					}
        				}
        	}
        }

    }
}