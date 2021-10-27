package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
	private Element parent;
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
		Element el;
		try {
			if (elements != null){
				e.setParent(this);
			}else e.setParent(null);
			e.setParent(this);
			el = (Element) e.clone();
			elements.add(el);
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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


	@Override
	public void setParent(Element p) {
		// TODO Auto-generated method stub
		this.parent=p;
	}


	@Override
	public Element getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}



}
