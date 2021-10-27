package sabloaneProiectareBook;

public class Image implements Element{
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
	
}
