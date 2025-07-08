// base class for all book types
public abstract class Book {
    String isbn;
    String title;
    int year;
    double price;
    String author;

    Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    abstract boolean isAvailable();
}
