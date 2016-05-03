package edu.sjsu.p146.load;

import edu.sjsu.p146.service.BookService;

public class LoadBooks {

	public static void main(String[] args) {

		BookService bookService = new BookService();
		bookService.setFilePath("src/edu/sjsu/p146/service/books.txt");
		
		System.out.println(bookService.registerBook("Harry Potter and the Goblet of Fire", "J.K. Rowling", "1234567890"));
		System.out.println(bookService.registerBook("Twilight", "Stephenie Meyer", "1234567891"));
		System.out.println(bookService.registerBook("Slaughterhouse-Five", "Kurt Vonnegut", "1234567892"));
		System.out.println(bookService.registerBook("The Fault in Our Stars", "John Green", "1234567893"));
		System.out.println(bookService.registerBook("Dear John", "Nicholas Sparks", "1234567894"));
		System.out.println(bookService.registerBook("The Catcher in the Rye", "J.D. Salinger", "1234567895")); //close title check
		System.out.println(bookService.registerBook("Catch-22", "Joseph Heller", "1234567896")); //close title check
		System.out.println(bookService.registerBook("Divergent", "Veronica Roth", "1234567897")); //same author check
		System.out.println(bookService.registerBook("Insurgent", "Veronica Roth", "1234567898")); //same author check
		System.out.println(bookService.registerBook("Allegiant", "Veronica Roth", "1234567899")); //same author check
	}
}
