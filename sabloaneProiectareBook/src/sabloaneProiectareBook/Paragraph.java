package sabloaneProiectareBook;

public class Paragraph implements Element{
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
	
}
