package Attempt2;

public class Fiction extends Book implements ReadAble{


    public Fiction(String name, String author, int years) {
//        setTitle(name);
//        setAuthor(author);
//        setYear(years);
        super(name, author, years);
    }

    @Override
    public void read() {
        System.out.println("Fiction book is reading" + getTitle());
    }
}
