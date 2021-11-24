package sabloaneProiectareBook;

public class AlignRight implements AlignStrategy{
	
	public AlignRight() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Paragraph p) {
		// TODO Auto-generated method stub
		String text = p.getName();
		text = "#"+text;
		p.setName(text);
	}

}
