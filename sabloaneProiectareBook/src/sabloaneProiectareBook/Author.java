package sabloaneProiectareBook;

public class Author {
	private String name;

	public Author(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("Author: " + this.name);
	}
}
