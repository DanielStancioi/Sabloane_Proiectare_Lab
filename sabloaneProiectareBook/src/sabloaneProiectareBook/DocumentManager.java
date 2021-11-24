package sabloaneProiectareBook;

public class DocumentManager {
	private static DocumentManager single_instance = null;
    public Book b;
 
    private DocumentManager()
    {
        super();
    }
 
    public static DocumentManager getInstance()
    {
        if (single_instance == null)
            single_instance = new DocumentManager();
 
        return single_instance;
    }

	public Book getBook() {
		return b;
	}

	public void setBook(Book b) {
		this.b = b;
	}
    
}
