package sabloaneProiectareBook;

public abstract class Element implements Cloneable{
	protected Element parent;
	public abstract void print();
	public abstract void add(Element e);
	public abstract void remove(Element e);
	public abstract Element get(int i);
	public abstract void setParent(Element p);
	public abstract Element getParent();
	@Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
