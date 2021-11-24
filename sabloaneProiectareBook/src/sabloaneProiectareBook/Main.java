package sabloaneProiectareBook;

public class Main {
	public static void Printing(){
		DocumentManager.getInstance().getBook().print();
		}
	public static void main(String[] args) throws Exception {
		Book myBook = new Book("My Book");
		DocumentManager.getInstance().setBook(myBook);
		Author me = new Author("My Self");
		myBook.addAuthor(me);
		Section cap1 = new Section("Capitolul 1");
		myBook.add(cap1);
		Paragraph p1 = new Paragraph("Paragraph 1");
		p1.setAlignStrategy(new AlignRight());
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		p2.setAlignStrategy(new AlignLeft());
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		p3.setAlignStrategy(new AlignLeft());
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();

		Printing();
		}}
