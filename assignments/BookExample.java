package com.celcom.assignments;
import java.util.ArrayList;

class Book {
	
	private String title;
	private String author;
	private String ISBN;
	
	Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
//	void displayBooks() {
//		System.out.println("Book Name : " + title + "ISBN : " + ISBN + "Author : " + author);
//	}
}

class BooksCollection {
	
	ArrayList<Book> books;
	
	BooksCollection () {
		books = new ArrayList<>();
	}
	
	void addBook(Book book) {
		books.add(book);
		System.out.println("Book Added");
	}
	
	void removeBook(String ISBN) {
		boolean removed = false;
		for(Book book:books) {
			if(ISBN.equals(book.getISBN())) {
				books.remove(book);
				removed = true;
				System.out.println("Book with ISBN " + ISBN + " has been removed successfully");
			}
		}
		if(removed==false) {
			System.out.println("Book with ISBN cannot be found");
		}
	}
	
	void displayBooks() {
		if(books.isEmpty()) {
			System.out.println("No books were found");
		}
		else {
			for(Book book : books) {
				System.out.println("Book Name : " + book.getTitle() + " ISBN : " + book.getISBN() + " Author : " + book.getAuthor());
			}
		}
	}
}

public class BookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        
        BooksCollection collection = new BooksCollection();
        
       collection.addBook(book1);
       collection.addBook(book2);
       collection.addBook(book3);
       System.out.println();
       
       collection.displayBooks();
       System.out.println();
       collection.removeBook("9780061120084");
       System.out.println();
       collection.displayBooks();
       
       
		
		

	}

}
