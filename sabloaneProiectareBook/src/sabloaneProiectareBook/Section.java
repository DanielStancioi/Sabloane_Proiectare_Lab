package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
	private String name;
	List<Element> elements = new ArrayList<Element>();


	public Section(String name) {
		super();
		this.name = name;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		for (Element el: elements) {
			el.print();
		}
	}


	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		elements.add(e);
	}


	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		elements.remove(e);
	}


	@Override
	public Element get(int i) {
		// TODO Auto-generated method stub
		return elements.get(i);
	}



}
