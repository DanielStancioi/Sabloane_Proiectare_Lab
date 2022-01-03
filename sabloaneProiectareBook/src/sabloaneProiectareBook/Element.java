package sabloaneProiectareBook;

public abstract class Element implements Visitee {
	protected Element parent;
    abstract void print();

    abstract void add(Element el);
    abstract void remove(Element el);
    abstract Element get(int num);
   

}
