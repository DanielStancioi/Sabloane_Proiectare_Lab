package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	List<Author> authors = new ArrayList<Author>();
	List<Chapter> chapters = new ArrayList<Chapter>();
	public Book() {
		super();
	}
	public Book(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}
	public int createChapter(String s) {
		Chapter c = new Chapter(s);
		chapters.add(c);
		return chapters.indexOf(c);
	}
	public Chapter getChapter(int index) {
		return chapters.get(index);
	}
	public void print() {
		System.out.print("Book: " + this.title + " written by ");
		for (Author a: this.authors) {
			System.out.print(a.getName()+", ");
		}
		System.out.print("\n");
		for (Chapter ch : chapters) {
			
			ch.print();
		}
	}
}
