package sabloaneProiectareBook;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book discoTitanic = new Book("Disco Titanic");
		discoTitanic.addNewParagraph("Paragraph 1");
		discoTitanic.addNewParagraph("Paragraph 2");
		discoTitanic.addNewParagraph("Paragraph 3");
		discoTitanic.addNewImage("Image 1");
		discoTitanic.addNewParagraph("Paragraph 4");
		discoTitanic.addNewTable("Table 1");
		discoTitanic.addNewParagraph("Paragraph 5");
		discoTitanic.print();
		Book discoTitanic1 = new Book("Disco Titanic");
		discoTitanic1.addNewParagraph("Paragraph 1");
		discoTitanic1.addNewParagraph("Paragraph 2");
		discoTitanic1.print();
	}

}
