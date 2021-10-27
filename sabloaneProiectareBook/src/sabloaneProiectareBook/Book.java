package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
	
	List<Author> authors = new ArrayList<Author>();

	public Book(String title) {
		super(title);
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}
	
	public void print() {

		System.out.println("Authors: ");
		for (Author a: authors) {
			a.print();
		}
		System.out.println();
		super.print();
	}
}
