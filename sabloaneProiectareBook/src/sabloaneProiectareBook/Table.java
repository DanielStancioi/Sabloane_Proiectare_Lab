package sabloaneProiectareBook;

public class Table implements Element{
	private String name;

	public Table() {
		super();
	}

	public Table(String name) {
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
		System.out.println("Table: " + this.name);
	}
	
}
