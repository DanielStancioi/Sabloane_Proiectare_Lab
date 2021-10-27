package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String name;
	List<SubChapter> subchapters = new ArrayList<SubChapter>();


	public Chapter(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int createSubChapter(String n) {
		SubChapter s = new SubChapter(n);
		subchapters.add(s);
		return subchapters.indexOf(s);
	}
	public SubChapter getSubChapter(int index) {
		return subchapters.get(index);
	}
	public void print() {
		System.out.println("Chapter "+ this.name);
		for (SubChapter el : subchapters) {
			el.print();
		}
	}
}
