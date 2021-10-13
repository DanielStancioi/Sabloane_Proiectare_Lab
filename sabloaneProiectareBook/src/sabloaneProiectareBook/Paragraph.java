package sabloaneProiectareBook;

public class Paragraph implements Element{
	private String text;

	public Paragraph() {
		super();
	}

	public Paragraph(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("Paragraph: " + this.text);
	}
	
}
