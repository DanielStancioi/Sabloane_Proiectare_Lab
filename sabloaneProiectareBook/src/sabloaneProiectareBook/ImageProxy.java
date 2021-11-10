package sabloaneProiectareBook;

public class ImageProxy extends Element{
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
	public void add(Element e) throws CloneNotSupportedException {
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

	@Override
	public void setParent(Element p) {
		// TODO Auto-generated method stub
		this.parent=p;
	}

	@Override
	public Element getParent() {
		// TODO Auto-generated method stub
		loadImage();
		return this.parent;
	}

}
