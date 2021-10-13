package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	List<Element> elements = new ArrayList<>();
	public SubChapter() {
		super();
	}

	public SubChapter(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public int addNewParagraph(String p) {
		Paragraph par = new Paragraph(p);
		elements.add(par);
		return elements.indexOf(par);
	}
	public int addNewImage(String i) {
		Image img = new Image(i);
		elements.add(img);
		return elements.indexOf(img);
	}
	public int addNewTable(String t) {
		Table tab = new Table(t);
		elements.add(tab);
		return elements.indexOf(tab);
	}
}
