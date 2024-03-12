package generic.ex.ex4;

public class Book implements Media{
    String title;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String author;

    @Override
    public String getTitle() {
        return title;
    }
}
