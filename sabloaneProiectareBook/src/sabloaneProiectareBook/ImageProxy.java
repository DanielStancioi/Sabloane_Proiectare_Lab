package sabloaneProiectareBook;

public class ImageProxy extends Element implements  Visitee{
	 private Image img;
	 private String url;
	 private Element parent;
	 
	 public ImageProxy(String url) {
		super();
		this.url = url;
		this.img = null;
	}

	public Image loadImage() {
		 if (this.img == null) {
	            this.img = new Image(url);
	        }
		 return this.img;
	 }

	@Override
	public void print() {
		// TODO Auto-generated method stub
		loadImage();
		this.img.print();
		
	}

	@Override
	public void add(Element e)  {
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
		loadImage();
		return this.parent;
	}
	public void render() {
		// TODO Auto-generated method stub
		loadImage();
		this.img.print();
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

}
