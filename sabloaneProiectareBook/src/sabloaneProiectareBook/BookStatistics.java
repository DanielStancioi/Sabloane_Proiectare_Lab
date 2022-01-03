package sabloaneProiectareBook;

public class BookStatistics implements Visitor{
	private int imgNumber, tabNumber, parNumber;

    public BookStatistics() {
        this.imgNumber = 0;
        this.tabNumber = 0;
        this.parNumber = 0;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + this.imgNumber);
        System.out.println("*** Number of tables: " + this.tabNumber);
        System.out.println("*** Number of paragraphs: " + this.parNumber);
    }

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Section section) {

    }

    @Override
    public void visit(TableOfContents tableOfContents) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        this.parNumber ++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        this.imgNumber ++;
    }

    @Override
    public void visit(Table table) {
        this.tabNumber ++;
    }

    @Override
    public void visit(Image image) {
        this.imgNumber ++;
        System.out.println("Imagine");
    }
}
