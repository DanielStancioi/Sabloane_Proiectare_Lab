package sabloaneProiectareBook;

public class AlignLeft implements AlignStrategy {

	
	public AlignLeft() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Paragraph p) {
		// TODO Auto-generated method stub
		String text = p.getName();
		text = text+"#";
		p.setName(text);
	}

}
