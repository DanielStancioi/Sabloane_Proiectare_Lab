package sabloaneProiectareBook;

public class GenerateToC implements Visitor {
	private TableOfContents toc = new TableOfContents("Table of contents");
    private  int number1 = 0;

    public TableOfContents getToc() {
        return toc;
    }

    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(Section section) {
        
        toc.addEntry(section.getName() + "......"+ number1);
    }

    @Override
    public void visit(TableOfContents tableOfContents) {

    }

    @Override
    public void visit(Paragraph paragraph) {
    	number1 ++;
      
    }

    @Override
    public void visit(ImageProxy imageProxy) {
    	number1 ++;
        
    }

    @Override
    public void visit(Table table) {
    	number1 ++;
        
    }

    @Override
    public void visit(Image image) {
    	number1 ++;
        
    }
}
