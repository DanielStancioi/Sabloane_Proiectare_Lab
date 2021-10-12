package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	List<String> elements = new ArrayList<String>();
	public Book() {
		super();
	}
	public Book(String title) {
		super();
		this.title = title;
	}
	public String getTitlu() {
		return title;
	}
	public void setTitlu(String title) {
		this.title = title;
	}
	
	public void addNewParagraph(String p) {
		elements.add(p);
	}
	public void addNewImage(String i) {
		elements.add(i);
	}
	public void addNewTable(String t) {
		elements.add(t);
	}
	public void print() {
		System.out.println("Book: " + this.title);
		for (String el : this.elements) {
			System.out.println(el);
		}
	}
}
