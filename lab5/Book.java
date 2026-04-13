import java.util.Objects;

public class Book implements LibraryItem {
    private String isbn;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String isbn, String t, String a, int y) {
        this.isbn = isbn;
        this.title = t;
        this.author = a;
        this.year = y;
    }

    @Override
    public String getType() { return "Book"; }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getId() { return isbn; }

    @Override
    public boolean isAvailable() { return available; }

    public String getAuthor() { return author; }

    public int getYear() { return year; }

    @Override
    public String toString() {
        return getType() + "{" + getId() + ", title=" + getTitle() + ", author=" + getAuthor() +", Year=" + getYear() + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    public void setAvailable(boolean a) { available = a; }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Book b && title.equals(b.title) && isbn.endsWith(b.isbn);
    }
}
