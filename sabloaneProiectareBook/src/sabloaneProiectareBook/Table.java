package sabloaneProiectareBook;

public class Table extends Element implements Visitee{
	private Element parent;
	private String name;

	public Table(String name) {
		super();
		this.name = name;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Table: " + this.name);
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





	public Element getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Table: " + this.name);
	}
	
}
