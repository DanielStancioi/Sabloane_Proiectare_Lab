package sabloaneProiectareBook;

public class AlignCenter implements AlignStrategy {

	public AlignCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void render(Paragraph p) {
		// TODO Auto-generated method stub
		String text = p.getName();
		text = "###" + text+ "###";
		p.setName(text);
	}

}
