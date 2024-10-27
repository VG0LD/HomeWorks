package Attempt2;

public class NonFiction extends Book implements ReadAble{

    public NonFiction(String name, String author, int years) {
//        setTitle(name);
//        setAuthor(author);
//        setYear(years);
        super(name, author, years);
    }

    @Override
    public void read() {
        System.out.println("Reading Non Fiction book" + getTitle());
    }
}
