package sabloaneProiectareBook;

public class Image extends Element{
	private Element parent;
	private String name;


	public Image(String name) {
		super();
		this.name = name;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Image: " + this.name);
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
	
}
