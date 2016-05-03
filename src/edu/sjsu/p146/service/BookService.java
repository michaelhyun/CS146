package edu.sjsu.p146.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import edu.sjsu.p146.util.FileUtil;

public class BookService {
	
	//methods in this class: setFilePath, search, sortBooks, registerBook, addBook, readBooksFromFile
	
	private List<Book> books;
	private String filePath;
	
	public BookService() {
		this.filePath = this.getClass().getResource("").getPath() + "books.txt"; //leads to books.txt
		this.books = this.readBooksFromFile(); //method below
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public List<Book> search(String title, String author, String isbn) {
		
		//fix this
		List<Book> list = new ArrayList<Book>();
		if(!title.isEmpty()) {
			if(!author.isEmpty()) {
				
			}
			
		} else if(!author.isEmpty()) {
			
		} else {
			
		}
		
		//after you get a subset of book that match your search criteria
		//sort here
		List<Book> sorted = sortBooks(list);
		
		//return sorted
		return this.books;
	}
	

	private List<Book> sortBooks(List<Book> list) {
		// TODO Sort here
		return list;
	}
	
	/**
	 * method used to register the new book, gets the information of the new book
	 * @param title the title of the new book
	 * @param author the author of the new book 
	 * @param isbn the isbn of the new book
	 * @return message that indicates if registration was successful or not successful
	 */
	public String registerBook(String title, String author, String isbn) {
		String message = "SUCCESS";

		//checks if book already exists
		boolean exists = false;
		for(Book book : this.books) { //goes through List books
			if(book.getIsbn().equals(isbn)) { //checks by ISBN (easiest way of checking)
				exists = true;
				break;
			}
		}
		
		if(!exists) {
			boolean successful = this.addBook(title, author, isbn);
			if(successful) {
				message = "SUCCESS"; //successfully added to the file
			} else {
				message = "Could not write new book to file.";
			}
		} else {
			message = "ISBN" + isbn + " already exists!";
		}
		return message;
	}
	
	/**
	 * method to add the information of the new book to the text file (books.txt)
	 * @param title the title of the newly registered book
	 * @param author the author of the newly registered book
	 * @param isbn the isbn of the newly registered book
	 * @return
	 */
	private boolean addBook(String title, String author, String isbn)
	{
		boolean successful;
		Book book = new Book(title, author, isbn);
		this.books.add(book);
		
		Gson gson = new Gson();
		String jsonData = gson.toJson(this.books); //creates a JSON String representation of the books List
		
		try {
			FileUtil.writeToFile(this.filePath, jsonData); //write the JSON String representation to the file in file pat
			successful = true; //if the book is successfully added to the file (books.txt)
		} catch (IOException e) {
			successful = false; //IOException is thrown when there is an issue with finding file (books.txt) in file path or writing to file (books.txt)
		}
		return successful;
	}
	
	/**
	 * method that uses Google Gson library to read file and deserialize the JSON String to given Object
	 * @return the List list
	 */
	private List<Book> readBooksFromFile() { 
		List<Book> list = null;
		try {
			Gson gson = new Gson();
			JsonReader jsonReader = new JsonReader(new FileReader(this.filePath));
			Book[] books = gson.fromJson(jsonReader, Book[].class);
			//if file contains nothing, books will be null
			//if books == null, create an empty list
			//if books =! null, create a list and add books to it
			list = (books == null) ? new ArrayList<Book>() : new ArrayList<Book>(Arrays.asList(books));
		} catch (IOException e) {
			list = new ArrayList<Book>(); 
			System.out.println("returning an empty list of boooks");
			System.out.println(e.getMessage());
		}
		return list;
	}

}
