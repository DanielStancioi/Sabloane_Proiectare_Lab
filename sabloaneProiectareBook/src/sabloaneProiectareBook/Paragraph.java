package sabloaneProiectareBook;

public class Paragraph implements Element{
	private String name;
	
	public Paragraph(String text) {
		super();
		this.name = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String text) {
		this.name = text;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Paragraph: " + this.name);
	}
	
}
