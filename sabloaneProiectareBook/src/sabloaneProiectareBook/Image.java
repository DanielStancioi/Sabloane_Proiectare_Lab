package sabloaneProiectareBook;

public class Image implements Element{
	private String name;


	public Image(String name) {
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
		System.out.println("Image: " + this.name);
	}
	
}
