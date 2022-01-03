package sabloaneProiectareBook;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element implements Visitee{
	
	private String name;
	List<Element> elements = new ArrayList<Element>();


	public Section(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
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
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		for (Element el: elements) {
			el.print();
		}
	}


	@Override
	public void add(Element e)  {
		// TODO Auto-generated method stub
        if (e.parent == null) {
            this.elements.add(e);
            e.parent = this;
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
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
        for (Element el:elements) {
            el.accept(visitor);
        }
	}



}
