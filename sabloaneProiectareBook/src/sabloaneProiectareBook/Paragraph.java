package sabloaneProiectareBook;

public class Paragraph extends Element{
	private String name;
	
	public Paragraph(String text) {
		super();
		this.name = text;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Paragraph: " + this.name);
	}


	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Element get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setParent(Element p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Element getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setAlignStrategy(AlignStrategy a) {
		a.render(this);
	}
}
