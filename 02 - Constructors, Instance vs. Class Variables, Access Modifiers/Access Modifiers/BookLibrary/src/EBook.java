public class EBook extends Book{
    public EBook(String ISBN, String title, String author) {
        super(ISBN);
        this.title = title;
        setAuthor(author);
    }

    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}
