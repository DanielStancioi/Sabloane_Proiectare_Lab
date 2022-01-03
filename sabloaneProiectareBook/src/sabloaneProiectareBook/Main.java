package sabloaneProiectareBook;

public class Main {
	public static void Printing(){
		DocumentManager.getInstance().getBook().print();
		}
	public static void main(String[] args) throws Exception {
		/*
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
		*/
        Book book = new Book("Some title");
        Author auth = new Author("Stancioi");
        book.addAuthor(auth);
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        p1.setAlignStrategy(new AlignLeft());
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        p2.setAlignStrategy(new AlignRight());
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        p3.setAlignStrategy(new AlignCenter());
        cap1.add(p3);
        cap1.add(new ImageProxy("someimg.jpg"));
        cap1.add(new Image("someimg2.jpg.jpg"));
        cap1.add(new Paragraph("Another par"));
        cap1.add(new Table("Table 1"));

        book.add(cap1);

        cap1.accept(new RenderContentVisitor());
        
        Section cap2 = new Section("Capitolul 2");
        Paragraph p11 = new Paragraph("Paragraph 1");
        p1.setAlignStrategy(new AlignLeft());
        cap2.add(p11);
        Paragraph p21 = new Paragraph("Paragraph 2");
        p21.setAlignStrategy(new AlignRight());
        cap2.add(p21);
        Paragraph p31 = new Paragraph("Paragraph 3");
        p31.setAlignStrategy(new AlignCenter());
        cap2.add(p31);
        cap2.add(new ImageProxy("someimg.jpg"));
        cap2.add(new Image("someimg2.jpg.jpg"));
        cap2.add(new Paragraph("Another par"));
        cap2.add(new Table("Table 1"));

        book.add(cap2);

        cap2.accept(new RenderContentVisitor());

        GenerateToC toc = new GenerateToC();
        cap1.accept(toc);
        cap2.accept(toc);
        TableOfContents res = toc.getToc();
        res.render();
        
        BookStatistics s = new BookStatistics();
        cap1.accept(s);
        cap2.accept(s);
        s.printStatistics();
		}}
