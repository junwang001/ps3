package pkgMain;

import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class BookMain {
	
	public BookMain() {
		
	}
	
	public Book getBook(String id) throws BookException {
		Catalog cat = XMLReader.readCatalog();
		for (Book b : cat.getBooks()) {
			if(id.equals(b.getId())) {
				return b;
			}
		}
		throw new BookException();
	}
	
	public void addBook(int id, Book book) throws BookException {
		Catalog cat = XMLReader.readCatalog();
		if(cat.getId() == id) {
			for (Book b : cat.getBooks()) {
				if(b.getId().equals(book.getId())) {
					throw new BookException();
				}
			}
			cat.getBooks().add(book);
			XMLReader.writeXMLFile(cat);
		}
	}
	
}
