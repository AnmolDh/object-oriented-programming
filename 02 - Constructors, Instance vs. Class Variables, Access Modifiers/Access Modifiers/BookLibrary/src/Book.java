public class Book {
    public final String ISBN;
    protected String title;
    private String author;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String ISBN){
        this.ISBN = ISBN;
    }
}
