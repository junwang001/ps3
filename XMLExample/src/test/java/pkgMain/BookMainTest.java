package pkgMain;

import java.util.Date;

import org.junit.Test;

import pkgLibrary.Book;

public class BookMainTest {
	
	@Test
	public void testBookFound() {
		
		BookMain main = new BookMain();
		try {
			Book book1 = main.getBook("bk102");
			System.out.println(book1.getId());
		} catch (BookException e) {
			System.out.println("the book is NOT found");
		}
		
	}
	
	@Test
	public void testBookNotFound() {
		BookMain main = new BookMain();
		try {
			Book book2 = main.getBook("bk202");
			System.out.println(book2.getId());
		} catch (BookException e) {
			System.out.println("the book is NOT found");
		}
	}
	
	@Test
	public void testBookExists() {
		BookMain main = new BookMain();
		Book book3 = new Book();
		book3.setId("bk101");
		book3.setAuthor("Galos, Mike");
		book3.setDescription("An in-depth look at creating applications with XML.");
		book3.setCost(52.66);
		book3.setGenre("Computer");
		book3.setPrice(65.82);
		book3.setPublish_date(new Date());
		book3.setTitle("XML Developer's Guide");
		try {
			main.addBook(0, book3);
		} catch (BookException e) {
			System.out.println("the book exists");
		}
	}
	
	@Test
	public void testBookNotExists() {
		BookMain main = new BookMain();
		Book book4 = new Book();
		book4.setId("bk113");
		book4.setAuthor("Galos, Mike");
		book4.setDescription("An in-depth look at creating applications with XML.");
		book4.setCost(52.66);
		book4.setGenre("Computer");
		book4.setPrice(65.82);
		book4.setPublish_date(new Date());
		book4.setTitle("XML Developer's Guide");
		try {
			main.addBook(0, book4);
		} catch (BookException e) {
			System.out.println("the book exists");
		}
	}
}
